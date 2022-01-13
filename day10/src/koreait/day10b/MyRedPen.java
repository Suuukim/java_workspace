package koreait.day10b;

import java.util.Random;
import java.util.Scanner;

public class MyRedPen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] x1 = new int[10];    //틀린문제 다시보기(또는 풀기)를 위한 배열
		int[] x2 = new int[10];
		int[] no = new int[10];
		int n1,n2,ans;
		int cnt=0;
		System.out.println("----------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("----------------------------------------------");
		System.out.println("시작합니다.");
		for(int i=0;i<10;i++) {
			//이 위치 for 문의 지역변수로 선언해도 되는 변수는 ? n1,n2, ans
			n1 = r.nextInt(89)+11;		//nextInt(max-min+1)+min;  0~88
			n2 = r.nextInt(89)+11;		//nextInt(max-min+1)+min;
			System.out.print("문제 "+(i+1)+".  " +n1 +"+ "+ n2+" =  답 입력 -> ");
			ans = sc.nextInt();
			if(ans == n1+n2) cnt++;
			else {
				//3개 배열에 틀린문제 내용 저장하기.
			}
		}
		System.out.println("----------------------------------------------");
		System.out.println("채점 합니다. 맞은 갯수  "+ cnt + " ( " + (cnt*10) +" 점)");
		//틀린문제에 대해 번호, 문제 , 정답 보여주기 입니다.
		
	}
}
