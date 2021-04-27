package sec13.exam03_field_method_access.package2;

import sec13.exam02_field_method_access.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 2;  //default,x
		//a.field3 = 3; //private, x
		
		a.method1();
	//	a.method2();	//default, x
	//	a.method3();	//private, x
	}

}
