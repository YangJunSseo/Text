package sec05.exam04_local_variable_access;

public class Anonymous {
	//�ʵ�
	private int field;
	
	//������
	
	//�޼ҵ�
	public void method(int arg1 , int arg2) {
		int var1 = 0;
		int var2 = 0;
		
		field =  10;
		
		var1 = 30;
		
		// ���ú��� calc�� �͸�����ü�� ���Խ�Ų��.
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				return 0;
			}
			
		};
		
	}

}
