package sec04.exam01_overriding;

public class Computer extends Calculator {

	//�޼ҵ� ������
	//������̼�: �����Ϸ����� �ڵ�(������ ����) ������ ��û�Ѵ�.
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
	

}
