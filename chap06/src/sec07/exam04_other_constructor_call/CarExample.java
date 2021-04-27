package sec07.exam04_other_constructor_call;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		System.out.println("car.company="+car1.compnay);
		System.out.println("car.model="+car1.model);
		
		Car car2 =new Car("자가용");
		System.out.println("car2.companay="+car2.compnay);
		System.out.println("car2.model="+car2.model);
		System.out.println("car2.color="+car2.color);
		
		Car car3 = new Car("자가용","빨강");
		System.out.println("car3.companay="+car3.compnay);
		System.out.println("car3.model="+car3.model);
		System.out.println("car3.color="+car3.color);
		System.out.println("car3.maxSpeed="+car3.maxSpeed);
		
		Car car4 = new Car("택시","검정",200);
		System.out.println("car4.companay="+car4.compnay);
		System.out.println("car4.model="+car4.model);
		System.out.println("car4.color="+car4.color);
		System.out.println("car4.maxSpeed="+car4.maxSpeed);
		

	}

}
