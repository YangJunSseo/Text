package sec06.exam01_protected.package1;

public class B {
	public void method() {
		A a =new A();	//O, protected ���� �����ڴ� ���� ��Ű������ ���� �� �� �ִ�.
		a.field = "value";
		a.method();
	}

}
