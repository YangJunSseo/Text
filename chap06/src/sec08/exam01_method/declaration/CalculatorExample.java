package sec08.exam01_method.declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculator Ŭ������
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int result1=myCalc.plus(5,6); //result1 = 11
		System.out.println("result1="+result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x,y); //�ڵ�����ȯ byte ->int
		System.out.println("result2="+result2);
		
		myCalc.powerOff();
		
		

	}

}
