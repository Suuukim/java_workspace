package koreait.day14;

public class AnimalCommunity {
	//반려동물 커뮤니티에는 무엇이 필요할까요? 용품 공동구매 , 반려<동물>분양, .... , <회원>
	
	public static void main(String[] args) {
		
		//동물클래스 배열에 고양이(Cat) 객체, 강아지객체, 토끼(Rabbit) 객체.. 등을 참조하도록 합니다.
		//분양가능한 동물객체를 생성해서 참조하기
		Animal[] animals = new Animal[5];
		
		animals[0] = new Puppy("브라우니", "Brown");
		animals[1] = new Cat();
		animals[2] = new Rabbit("바니바니", "White");
		animals[1].setName("냥이");
		animals[1].setColor("Black");
		animals[3] = new Puppy();
		
		//회원은 반려동물 분양.
		System.out.println("[[환영합니다. 반려동물을 보여드리겠습니다.]]\n");
		for(int i=0;i<animals.length;i++) {
			System.out.println(i + ":" + animals[i]);
		}
		System.out.print("분양을 원하는 아이의 숫자를 선택해 주세요. ->");
		
		

	}

}
