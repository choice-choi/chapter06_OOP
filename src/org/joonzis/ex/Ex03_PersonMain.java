package org.joonzis.ex;

// 클래스 만듦 
// 클래스가 2개 이상인 경우
// public 키워드는 파일명과 일치하는 클래스에만 명시한다.(현재 여기선 public 붙으면 안 됨, 파일명이 똑같은 클래스에 붙어야 함)
class Person{
	// 필드
	char gender;
	int age;
	double height;
	String name;
	
	void info() {
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("이름 : " + name);
	}
}


public class Ex03_PersonMain {
	public static void main(String[] args) {
	
			// 위 Person 클래스 객체를 생성하여 정보 출력
			Person woman = new Person();
			//메인 메소드에서 생성된 객체를 통해 Person 클래스에 있는 선언한 필드들을 메인 메소드에서 값을 저장
			woman.gender = '여';			
			//gender는 보통 String인데 왜 Char로 받는지? 오류메세지:(Type mismatch: cannot convert from String to char) 
			// -> 상위 필드에서 gender를 String 타입이 아닌 char로 받았기 때문이다.
			woman.age = 25;
			woman.height = 170;
			woman.name = "최현아";
			woman.info();
			
			System.out.println("======================");
			
			
			Person man = new Person();
			man.gender = '남';
			man.age = 16;
			man.height = 180;
			man.name = "최은우";
			man.info();
			//위 정보와 똑같이 생겼지만 저장공간이 다름, 새로 클래스가 생김
			// 한 파일에서 클래스 두개 생성 됨
			
			
			
//			System.out.println("======================");
//				// 2. 생성된 객체 활용
//				// 객체명.필드메소드명(데이터 클래스)
//				Person person = new Person();
//				person.gender = '여';
//				person.age = 12;
//				person.height = 135;
//				person.name = "최현";
//				person.info();
				
				
				

			
				
		
		
	}
}
