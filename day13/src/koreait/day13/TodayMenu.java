package koreait.day13;

import java.util.HashMap;
import java.util.Scanner;

public class TodayMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
					//value 투표수 카운트하고 저장합니다.
		System.out.println(map);
		
		System.out.println("투표합시다.!!");
		System.out.println("오늘의 저녁 메뉴 : 치킨, 떡볶이, 곱창전골, 오징어물회, 불고기");
		
		map.put("치킨", 0);
		map.put("떡볶이", 0);
		map.put("곱창전골", 0);
		map.put("오징어물회", 0);
		map.put("불고기", 0);
		
		while(true) {
			int temp;
			System.out.print("선택메뉴 음식명 입력하세요.(종료 : end) -> ");
			String menu = sc.nextLine();
			//문자열 동등비교 메소드 equals
			if(menu.equals("end")) break;		//종료조건
			
			//입력한 메뉴가 key값입니다. 해당 key의 value 값을 가져와서 +1 증가시키고 그 값을 map에 변경합니다.
			temp = map.get(menu);			//temp++;
			map.put(menu,++temp);			//이미 있는 key 의 value 값을 변경
			//map.put(menu,temp++);  //temp값을 put 메소드로 저장 -> temp +1증가
			//    -> map.put(menu,temp); temp++;  
			
			//map.put(menu,++temp);  //temp +1증가 -> temp값을 put 메소드로 저장
			//   -> temp++;    map.put(menu,temp);
			//결론 : ++ 또는 -- 연산은 다른 메소드 또는 연산자 또는 출력문...과 같이 쓰일때 위치에따라 먼저 또는 나중에 실행.
			
			System.out.println("현재 투표상황 : " + map);
		}
		
		
		System.out.println(":::: 투표 종료 ::::");
	}

}

