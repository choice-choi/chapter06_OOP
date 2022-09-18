package org.joonzis.test.test;
/*
	Q1. 
		클래스 Circle
		- 필드 : radius, PI, name
		- 메소드 : info
		클래스 CircleMain
		- 메소드 : main
		값을 대입해서 확인
*/

public class Circle {
	
	double radius;
	final double PI = 3.141592; 		// final을 붙여서 상수처리, 좋은 구성은 아님!
	String name;
	
	void info() {
		System.out.println("반지름 : " + radius);
		System.out.println("이름 : " + name);
		System.out.println("크기 : " + radius*radius*PI);
		System.out.println("둘레 : " + 2 * PI * radius);
	}
	
	
}
