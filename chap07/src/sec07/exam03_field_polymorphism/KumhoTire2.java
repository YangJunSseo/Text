package sec07.exam03_field_polymorphism;

public class KumhoTire2 extends Tire {
	//�ʵ�
	//������
	public KumhoTire2(String location, int maxRotatoin) {
		super(location,maxRotatoin); //�θ�����ڸ� ȣ���Ͽ� �θ�ü�� �����Ѵ�.
	}

	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotatoin;
		if(accumulatedRotatoin<maxRotation) {
			System.out.println(location+"KumhoTire����:"+(maxRotation-accumulatedRotatoin)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"KumhoTire ��ũ ***");
			return false;
		
		
	}
	
	

}
}
