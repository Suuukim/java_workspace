package koreait.day12;

public class MathProblem {
	private int n1;
	private int n2;
	private char op;		//연산자 + , - ,x ,÷
	
	public MathProblem(char op) {
		this.op = op;
	}
	
	
	
	//getter 메소드만 작성합니다.
	public int getN1() {
		return n1;
	}
	
	public int getN2() {
		return n2;
	}
	
	public char getOp() {
		return op;
	}
	
	
}
