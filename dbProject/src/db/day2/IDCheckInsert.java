package db.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import db.day1.OracleConnectUtil;

public class IDCheckInsert {

	private static Connection conn = OracleConnectUtil.connect();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sql ="INSERT INTO TBL_CUSTOM# " + 
				"(CUSTOM_ID, NAME, EMAIL, AGE, REG_DATE) " + 
				" VALUES(?, ?, ?, ?, sysdate)";
		
		System.out.println("고객을 등록합니다.먼저 사용할 ID 입력하고 중복확인 합니다. ");
		String id=null;
		while(true){	//id 중복 검사
			System.out.print("ID 입력 -> ");
			id = sc.nextLine();
			if(idCheck(id)) {
				System.out.println("사용할 수 있는 id 입니다.");
				break;
			}else {
				System.out.println("중복된 id가 있습니다. 다른 id로 해주세요...");
			}
		}
		System.out.println( "등록할 id \"" + id + "\" 입니다.");
		
		System.out.print("성명 -> ");
		String name = sc.nextLine();
		System.out.print("이메일 -> ");
		String email = sc.nextLine();
		System.out.print("나이 -> ");
		int age = Integer.parseInt(sc.nextLine());
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setInt(4, age);
			pstmt.execute();
			System.out.println("고객님 환영합니다.!!");
			pstmt.close();
		}catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
		OracleConnectUtil.close(conn);
	}

	private static boolean idCheck(String id) {
		boolean result = false;
		ResultSet rs = null;
		String sql="select * from tbl_custom# where custom_id=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(!rs.next()) result = true;		//rs.next()==false
			
		}catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		
		}
		return result;	//중복되면 false, 중복없으면 true(rs.next()가 false일떄)
	}

}
