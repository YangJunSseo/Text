package sec07.exam03_field_polymorphism;

public class KumhoTire2 extends Tire {
	//필드
	//생성자
	public KumhoTire2(String location, int maxRotatoin) {
		super(location,maxRotatoin); //부모생성자를 호출하여 부모객체를 생성한다.
	}

	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotatoin;
		if(accumulatedRotatoin<maxRotation) {
			System.out.println(location+"KumhoTire수명:"+(maxRotation-accumulatedRotatoin)+"회");
			return true;
		}else {
			System.out.println("***"+location+"KumhoTire 펑크 ***");
			return false;
		
		
	}
	
	

}
}
