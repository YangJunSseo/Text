package sec02.exam01_if;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 70;
		
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		}else if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 C입니다.");
		}else if(score>70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 D입니다.");
			
		}else {
			
		}

	}

}
