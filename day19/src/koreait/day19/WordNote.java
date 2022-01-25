package koreait.day19;

public interface WordNote {	//단어장은 이 인터페이스를 구현하도록 합니다.(규칙/그룹화)
	
	
	//무슨 메소드 일까요? 추상메소드 , 생략된 키워드는? public abstract   
	void wordAdd();
	void wordList();
	void wordSave(String filename);
	void wordRead(String filename);
	
}
