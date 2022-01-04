package koreait.day5;

import java.util.Scanner;

public class YourTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[[사용자 패스워드 검사]]");
		System.out.println("\n사용하실 패스워드를 입력하시오->");
		String psw;
		String message="";
		boolean isOk= false;
		boolean isOk2= false;
		boolean isOk3= false;
		psw=sc.nextLine();
		int leng;
		leng= psw.length();
		if (leng<8)
			message += "1) 8글자 이상으로 합니다.\n";
		//특수문자
		for (int i=0;i<leng;i++) {
			int ch2;
			ch2 = psw.charAt(i);
			if (isOk==false) 
			{
				if(!(ch2 >='!'&& ch2 <='/'||ch2 >=':'&& ch2 <='@' || ch2 >='{'&& ch2 <='~'))
					isOk= false;
				else { 
					isOk= true;
				}
			}
			else
				isOk=true;
		
		}
		
		if(isOk==false)
			message +="2) 특수문자를 포함해야합니다.\n";
		
		isOk= false;
		isOk2 = false;
		//대문자
		for (int i=0;i<leng;i++) {
			int ch3;
			ch3 = psw.charAt(i);
			if (isOk==false) 
			{
				if(!(ch3>='A'&& ch3<='Z'))
					isOk= false;
				else { 
					isOk= true;
				}
			}
			else
				isOk=true;
		}
		//소문자
		for (int i=0;i<leng;i++) {
			int ch4;
			ch4 = psw.charAt(i);
			if (isOk2==false) 
			{
				if(!(ch4 >='a'&& ch4 <='z'))
					isOk2= false;
				else {
					isOk2= true;
					}
			}
			else
				isOk2=true;
		}
		isOk3 = isOk&&isOk2;
		if(isOk3==false)
			message +=  "3) 영문 대소문자 각각 1개 이상 포함해야합니다.\n";
		
		isOk=false;
		isOk2=false;
		isOk3 =false;
		
		//숫자
			for (int i=0;i<leng;i++) {
				int ch5;
				ch5 = psw.charAt(i);
				if (isOk2==false) 
				{
					if(!(ch5 >='0'&& ch5 <='9'))
						isOk2= false;
					else 
						isOk2= true;
				}
				else {
					isOk2=true;
				}
		}
			if (isOk2==false)
				message += "4) 숫자를 포함해야합니다.\n";
		System.out.println(message);
		
		if(message.length()<1)
			System.out.println("옳바른 비밀번호 입니다.");
}
}
