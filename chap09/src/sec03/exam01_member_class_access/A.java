package sec03.exam01_member_class_access;

public class A {
	//인스턴스 필드
	int[] intArraay = new int[3];
	B field1=new B();
	C fielf2 = new C();
	
	//인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
		}
	
	//정적 메소드
	static void method2() {
		//B var1 = new B();		//정적메소드에는 인스턴스 멤버 클래스를 사용할 수 없다.
		C var2 =new C();		//정적메소드에 정적 멤버 클래스를 사용할 수 있다.
	}
	
	
	class B{
	}
	
	//정적 멤버 클래스
	static class C{
	}

}
