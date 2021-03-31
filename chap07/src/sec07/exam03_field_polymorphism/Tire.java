package sec07.exam03_field_polymorphism;

public class Tire {
	//필드
	public int maxRotation; //최대 회전수
	public int accumulatedRotatoin; //누적 회전수
	public String location; // 타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotatoin) {
		this.location=location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotatoin;
		if(accumulatedRotatoin<maxRotation) {
			System.out.println(location+"Tire수명:"+(maxRotation-accumulatedRotatoin)+"회");
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크 ***");
			return false;
		}
	}

}
