package db.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import db.day1.OracleConnectUtil;

public class UpdateTest {

	private static Connection conn = OracleConnectUtil.connect();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PreparedStatement pstmt = null;
		String sql = "UPDATE TBL_CUSTOM# SET EMAIL=? WHERE CUSTOM_ID=?";
		String custom_id=null;
		
		while (true) {
			System.out.print("email 변경을 원하는 고객 ID를 입력하세요. -> ");
			custom_id = sc.nextLine();
			if (!idCheck(custom_id)) {
				System.out.println("존재하는 ID입니다.");
				break;
			} else {
				System.out.println("존재하지 않는 ID입니다. 다시 입력하세요");
			}
		}
		System.out.print("원하시는 email을 입력하세요. -> ");
		String email = sc.nextLine();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, custom_id);

			pstmt.execute();
			pstmt.close();

		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		System.out.println("정상적으로 email이 변경 되었습니다.");
		OracleConnectUtil.close(conn);
		sc.close();
	}

	private static boolean idCheck(String id) {
		boolean result = false;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from tbl_custom# where custom_id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (!rs.next())
				result = true;
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류" + e.getMessage());
		}
		return result; 
	}

}
