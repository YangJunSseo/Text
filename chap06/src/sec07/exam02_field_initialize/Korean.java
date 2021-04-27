package sec07.exam02_field_initialize;

public class Korean {
	//필드
	String nation="대한민국";
	String name;
	String ssn;
	
	//생성자
	//this는 자신객체를 의미한다.
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn =ssn;
		
	}

}
