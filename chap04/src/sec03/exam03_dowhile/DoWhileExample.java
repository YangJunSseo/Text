package sec03.exam03_dowhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		//Scanner클래스 타입 scanner 변수에 Scanner 객체를 생성하여 대입시킨다.
		Scanner scanner = new Scanner(System.in);
		// String 클래스 타입
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine(); // 표준입출력장치(콘솔)에서 한줄을 입력받아 inputString 변수에 대입시킨다.
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램종료");

	}

}
