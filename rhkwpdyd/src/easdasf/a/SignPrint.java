package easdasf.a;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		String grade=(num>0) ? "���" : ((num<0)? "����" : "0");
		System.out.println("�Է��Ͻ� ���� " + grade + " �Դϴ�.");
	}
}



