package sec03.exam01_for;

public class ForSumFrom1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0)
				sum=sum+i;
		}
		System.out.println("1~100까지 중 3의 배수의 합:"+sum);

	}

}
