package sec04.exam02_super;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL=1;
	public static final int SUPERSONIC =2;
	public int flyMode = NORMAL;
	
	//�޼ҵ� ������
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		}else {
			super.fly();	//�θ�(Airplane��ü)�� fly() �޼ҵ带 �����Ѵ�.
		}
	}

	
}
