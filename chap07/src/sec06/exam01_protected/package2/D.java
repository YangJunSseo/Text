package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class D extends A{
	public D () {
		this.field = "value"; 	//protecteds�� �ڽ� Ŭ�������� ������ ����Ѵ�.
		this.method();
	}

}