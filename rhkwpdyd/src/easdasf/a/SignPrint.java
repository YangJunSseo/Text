package easdasf.a;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		String grade=(num>0) ? "양수" : ((num<0)? "음수" : "0");
		System.out.println("입력하신 값은 " + grade + " 입니다.");
	}
}



