package sec07.exam03_field_polymorphism;

public class HankookTire extends Tire {
	//�ʵ�
	//������
	public HankookTire(String location, int maxRotatoin) {
		super(location,maxRotatoin); //�θ�����ڸ� ȣ���Ͽ� �θ�ü�� �����Ѵ�.
	}

	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotatoin;
		if(accumulatedRotatoin<maxRotation) {
			System.out.println(location+"HankookTire����:"+(maxRotation-accumulatedRotatoin)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"HankookTire ��ũ ***");
			return false;
		
		
	}
	
	

}
}
