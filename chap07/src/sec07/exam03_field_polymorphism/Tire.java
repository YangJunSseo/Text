package sec07.exam03_field_polymorphism;

public class Tire {
	//�ʵ�
	public int maxRotation; //�ִ� ȸ����
	public int accumulatedRotatoin; //���� ȸ����
	public String location; // Ÿ�̾��� ��ġ
	
	//������
	public Tire(String location, int maxRotatoin) {
		this.location=location;
		this.maxRotation = maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotatoin;
		if(accumulatedRotatoin<maxRotation) {
			System.out.println(location+"Tire����:"+(maxRotation-accumulatedRotatoin)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"Tire ��ũ ***");
			return false;
		}
	}

}
