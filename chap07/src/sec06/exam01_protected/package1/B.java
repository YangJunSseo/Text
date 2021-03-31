package sec06.exam01_protected.package1;

public class B {
	public void method() {
		A a =new A();	//O, protected 접근 제한자는 같은 패키지에서 접근 할 수 있다.
		a.field = "value";
		a.method();
	}

}
