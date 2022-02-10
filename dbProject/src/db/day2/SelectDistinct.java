package db.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.day1.OracleConnectUtil;

public class SelectDistinct {
// select 복습 
	public static void main(String[] args) {
		Connection conn = OracleConnectUtil.connect();
		PreparedStatement pstmt;
		ResultSet rs;
		String sql = "SELECT DISTINCT pcode FROM TBL_BUY#";
		
		System.out.println("구매 내역 확인합니다.");
		System.out.println("구매 내역은 판매된 상품코드로 조회합니다.");
		System.out.print("판매된 상품 코드 : ");
		//판매된 상품코드를 자바변수(List) 에 저장해보세요. codes
		
		try {
			pstmt= conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(String.format("%-20s", rs.getString(1)));
			}
			System.out.println();
		}catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
	}

}
