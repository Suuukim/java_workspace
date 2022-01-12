package koreait.day9;

import java.util.Random;
import java.util.Scanner;

public class NumberGame0 {
//김재선
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans;		//사용자 입력답.
		int cnt=0;		//시도횟수
		int[] tried= new int[10];		//사용자 선택 숫자
		
		boolean correct = false;		//정답 맞췄는가.
		
		System.out.println("숫자 맞추기 게임을 시작하지");
		Random rnd = new Random();
		int numb= rnd.nextInt(99)+1;	//컴퓨터 숫자
		
		//System.out.println(numb);확인용
		System.out.println("숫자 배열 완료");
		System.out.println("숫자는 1~100중 하나이다.");
		
		for(int i= 0; i<tried.length; i++) {
			System.out.println("숫자를 맞춰보아라");
			ans = sc.nextInt();
			
			if (ans<numb) {
				System.out.println("너무 작다");
				cnt++;
				tried[i]= ans;
			}
			else if (ans>numb) {
				System.out.println("너무 크다");
				tried[i]= ans;
				cnt++; 
			}
			else if (ans==numb) {
				correct = true;
				break;		//for 종료 경우1)
			}
		}  // for종료 경우2) i값이 tried.length 일때
		if (correct ==true) {
		System.out.println("맞췄네. 시도한 숫자는" );
			for(int i=0; i<cnt; i++)
			{
				System.out.print(" "+tried[i]);
			}
		System.out.print(" 으로 " +cnt+"번이다.");
			
		}
		else
			System.out.println("Game Over");
		
		
	}
}

