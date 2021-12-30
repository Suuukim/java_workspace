package koreait.day3;

import java.util.Scanner;

public class ElseIfTest {

	public static void main(String[] args) {
		int point;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("포인트 입력하세요. -> ");
		point = sc.nextInt();
		
		//if 문 형식2 : if(조건관계식1)  { ...A...   }   //조건관계식1이 참일때
				//	          else if(조건관계식2) 
				//            { ...B...  }		//조건관계식1은 거짓, 조건관계식 2는 참일때
				//            else
				//            { ...C...  }	//조건관계식1은 거짓, 조건관계식 2는 거짓일때
				//            
				
				//응용 : point 가 150 이상이면 사과세트를 , 100~149 이면 귤세트 ,
				//             50~99 이면  과자세트를  , 0~49 이면 5000원 상품권. 
				
				System.out.println("설날 증정선물 : ");
				
	}

}
