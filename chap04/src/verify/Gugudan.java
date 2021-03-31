package verify;

public class Gugudan {   /////////구구단/////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단 title출력
		for (int dan = 2; dan <= 9; dan++) {
			// System.out.print() 메소드는 한줄에 출력한다.
			System.out.print("[" + dan + "단]" + "\t" + "\t");
		}
			
			System.out.println();
			
			for (int i=1;i<=9; i++) {
				for(int dan=2; dan<=9; dan++) {
					System.out.print(dan+"x"+i+"="+(dan*i)+"\t");
			}
				System.out.println();
		}
		}
	}



