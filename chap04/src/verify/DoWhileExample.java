package verify;

import java.util.Scanner; /////////1~100 ������ ���� ���߱�///

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ran = (int) (Math.random() * 100) + 1;
	      int cnt = 0; 
	      int inNum = 0;
	      System.out.println("���ڸ� �Է��ϼ���");
	      do {
	         System.out.print(">");
	         inNum=sc.nextInt();
	         cnt++;
	         if(inNum>ran) {
	            System.out.println("�������� �Է��ϼ���");
	         }else if(inNum<ran) {
	            System.out.println("ū ���� �Է��ϼ���");
	         }
	         }while(inNum!=ran);
	      
	      // ...
	      System.out.println(cnt + "���� ���ƽ��ϴ�.");
	      sc.close();
	}
}


