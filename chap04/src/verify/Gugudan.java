package verify;

public class Gugudan {   /////////������/////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� title���
		for (int dan = 2; dan <= 9; dan++) {
			// System.out.print() �޼ҵ�� ���ٿ� ����Ѵ�.
			System.out.print("[" + dan + "��]" + "\t" + "\t");
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



