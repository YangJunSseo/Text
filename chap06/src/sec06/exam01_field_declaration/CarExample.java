package sec06.exam01_field_declaration;

//
public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car ��ü ����
		Car myCar = new Car();
		
		//�ʵ尪 �б�
		System.out.println("����ȸ��:"+myCar.company);
		System.out.println("�𵨸�:"+myCar.model);
		System.out.println("����:"+myCar.color);
		System.out.println("�ְ�ӵ�:"+myCar.maxspeed);
		System.out.println("����ӵ�:"+myCar.speed);
		
		//�ʵ尪 ����
		myCar.speed=60;
		System.out.println("������ �ӵ�:"+myCar.speed);

	}

}
