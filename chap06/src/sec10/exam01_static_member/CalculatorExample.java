package sec10.exam01_static_member;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result1 = 10 * 10 * Calculator.pi; // Calculator.pi�� ���� �ʵ��̴�.
		int result2 = Calculator.plus(10, 5); // Calculator.plus()�� ���� �޼ҵ�
		
		Calculator myCal = new Calculator();
		int result3 = myCal.minus(10, 5); // myCal.minus()�� �ν���Ʈ �޼ҵ�
		
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		System.out.println("result3="+result3);



	}

}
