package koreait.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyDictionaryApp { // 애플리케이션 클래스(main 메소드를 응용프로그램 실행을 시작합니다.)
	// 전역변수 선언.
	static Scanner sc = new Scanner(System.in);
	static List<Word> mywords = new ArrayList<>();		//단어들의 목록 (단어장)

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("선택 기능 👉   1. 단어추가     2. 단어장보기   3. 파일에 저장   4.파일에서 불러오기  5.프로그램 끝내기");
			System.out.print("선택 -> ");
			String sel = sc.nextLine();

			switch (sel) {
			case "1":
				wordAdd();
				break;
			case "2":
				wordList();
				break;
			case "3":
				wordSave();
				break;
			case "4":
				wordRead();
				break;
			case "5":
				run =false;
				break;
			default:
				System.out.println(":::: 잘못된 선택입니다. ::::");
				break;
			}

		} // while end
		System.out.println(":::: 프로그램 종료합니다. ::::");
	}// main end

	private static void wordAdd() { // 단어 추가
		System.out.println("[새로운 단어 추가]입니다.");
		do {
			System.out.print("\nEnglish -> ");  String eng = sc.nextLine();
			System.out.print("우리말 뜻 -> ");  String kor = sc.nextLine();
			
//입력받은 eng가  mywords 리스트에 있느냐?   있다면 -몇번째 인덱스인지 알아내서 그 위치에 kor 담기 , 없다면-kor 추가할 리스트 생성해서 담기
			
			
			
			
			
			
			System.out.print("단어 추가 계속 하시겠습니까?(y or n) -> ");
		}while(sc.nextLine().equals("y"));
	}

	private static void wordList() { // 단어 목록
		for(Word w : mywords)
			System.out.println(w);
	}

	private static void wordSave() { // 파일에 단어들을 저장합니다.

	}

	private static void wordRead() { // 파일에 저장된 단어들 읽어옵니다.

	}
}








