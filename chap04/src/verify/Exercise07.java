package verify;

import java.util.Scanner;

public class Exercise07 { /////// 은행 업무///////

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			// 작성 위치

			int menuNum = scanner.nextInt();

			switch (menuNum) {
			case 1:
				System.out.print("예금액>");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.print("잔고>");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
// 실행 결과
// --------------------------------------
// 1.예금 | 2.출금 | 3.잔고 | 4.종료
// --------------------------------------
// 선택> 1
// 예금액> 10000
//
//--------------------------------------
//1.예금 | 2.출금 | 3.잔고 | 4.종료
//--------------------------------------
//선택> 2
//출금액> 2000
//
//--------------------------------------
//1.예금 | 2.출금 | 3.잔고 | 4.종료
//--------------------------------------
//선택> 3
//잔고> 8000
//
//--------------------------------------
//1.예금 | 2.출금 | 3.잔고 | 4.종료
//--------------------------------------
//선택 4
//
//프로그램 종료
