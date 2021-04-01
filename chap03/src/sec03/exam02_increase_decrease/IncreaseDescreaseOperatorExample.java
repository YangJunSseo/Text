package sec03.exam02_increase_decrease;

public class IncreaseDescreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------------");
		x++; //9
		++x;  //8
		System.out.println("x="+x);  //8
		
		System.out.println("----------------------");
		y--;
		--y;
		System.out.println("y="+y); //8
		
		System.out.println("----------------------");
		z=x++;
		System.out.println("z="+z);  //12
		System.out.println("x="+x);  //13

	}

}
