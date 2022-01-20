package koreait.day16;

public class KakaoVIP extends CreditCard{
	
	public static final int MAX_LIMIT = 20000000;   
	
	private int point;
	
	public KakaoVIP(String owner,int limit) {
		super(owner);
		this.limit=limit;
		System.out.println("고객님이 원하시는 한도 " + limit +"원으로 설정되었습니다.");
	}
	
	public int getPoint() {
		return point;
	}
	
	@Override
	public int upLimit(int plus) {
		limit +=plus;
		System.out.println("고객님은 제한없이 한도 조정 가능합니다.[" + limit + " 입니다.");
		return plus;
	}		
	
	@Override
	public int pay(int money) {
		payTotal+=money;				//추가 현재이용금액+money가 limit 보다 크다면 
										//자동으로 한도 5000000 증가
		this.point+=money*0.01;			//VIP카드는 포인트가 있고 포인트 사용금액 0.1%
		return money;
	}
}
