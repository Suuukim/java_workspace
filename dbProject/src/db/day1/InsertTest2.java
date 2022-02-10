package db.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest2 {		//insert 할 값을 Scanner 클래스 사용해서 직접 입력 받으세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = OracleConnectUtil.connect();
		System.out.println("main메소드 확인용 : "+conn);
		
		String sql="INSERT INTO TBL_CUSTOM# " + 
				"(CUSTOM_ID, NAME, EMAIL, AGE, REG_DATE) " + 
	" VALUES(?, ?, ?, ?, sysdate)";  //값 부분에 ? -> 해당값은 execute전에 대입
		
		System.out.println("데이터베이스에 저장합니다.값 입력하세요.");
		System.out.print("고객ID -> ");
		String id=sc.nextLine();
		System.out.print("성명 -> ");
		String name = sc.nextLine();
		System.out.print("이메일 -> ");
		String email = sc.nextLine();
		System.out.print("나이 -> ");
		int age = Integer.parseInt(sc.nextLine());
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
		
			//? 에 해당하는 값을 전달합니다. ?순서를 1부터 시작하는 index로 지정합니다.
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setInt(4, age);
			
			pstmt.execute();		//sql 실행 메소드
			System.out.println("고객 1건이 새로 등록되었습니다.!!");
			pstmt.close();
		}catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}	
		
		OracleConnectUtil.close(conn);
	}

}
