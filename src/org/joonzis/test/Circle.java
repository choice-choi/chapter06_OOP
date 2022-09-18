package org.joonzis.test;

//필드: radius, PI, name
//메소드: info

public class Circle {

	double radius;
	final double PI = 3.14;		//final은 고정값, 바꿀 수 없는 수정 불가의 명칭
	String name;

	//메소드 만드는 구조, 메소드 선언 (메소드 불러오는 것 아님), 출력만 하고 끝낼 것
	public void info() {	//public은 접근제한자. 여기선 생략 가능 / void는 return을 하지 않겠다, 알아서 하겠다는 뜻 = 데이터 안 담기고 호출만 하면 끝
		System.out.println("반지름 : " + radius);
		System.out.println("이름 : " + name);	
		System.out.println("원의 크기 : " + PI * radius * radius);	
		System.out.println("원의 둘레 : " + (2 * PI * radius));	
	}	
	
	
}
	

		/*
		public int info()		//정수 데이터(리턴타입 정해짐)를 return 하겠다는 뜻
		public Spring info()	//문자열 return함
		 */