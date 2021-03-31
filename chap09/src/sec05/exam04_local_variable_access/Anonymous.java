package sec05.exam04_local_variable_access;

public class Anonymous {
	//필드
	private int field;
	
	//생성자
	
	//메소드
	public void method(int arg1 , int arg2) {
		int var1 = 0;
		int var2 = 0;
		
		field =  10;
		
		var1 = 30;
		
		// 로컬변수 calc에 익명구현객체를 대입시킨다.
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				return 0;
			}
			
		};
		
	}

}
