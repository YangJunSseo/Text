package easdasf.a;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputString;
		int sum = 0;
		int num = 0;
		int a = 0;
		do {
			num = sc.nextInt();
			sum += num;
			System.out.println("�Է�:" + num + "," + "��" + sum);
			a++;
			if(a == 5) {
				break;
			}
		} while (sum < 100);
		System.out.println("���α׷� ����!");
		sc.close();

	}

}
