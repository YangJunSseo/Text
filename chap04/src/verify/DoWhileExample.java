package verify;

import java.util.Scanner; /////////1~100 임의의 숫자 맞추기///

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ran = (int) (Math.random() * 100) + 1;
	      int cnt = 0; 
	      int inNum = 0;
	      System.out.println("숫자를 입력하세요");
	      do {
	         System.out.print(">");
	         inNum=sc.nextInt();
	         cnt++;
	         if(inNum>ran) {
	            System.out.println("작은수를 입력하세요");
	         }else if(inNum<ran) {
	            System.out.println("큰 수를 입력하세요");
	         }
	         }while(inNum!=ran);
	      
	      // ...
	      System.out.println(cnt + "번에 맞쳤습니다.");
	      sc.close();
	}
}


