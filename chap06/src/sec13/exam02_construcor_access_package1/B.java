package sec13.exam02_construcor_access_package1;

public class B {
	//필드
	A a1 = new A(true);	//public
	A a2 = new A(1);  //default 접근제한자는 같은 패키지내에서 접근 가능하다.
	//A a3 = new A ("문자열");	//x

}
