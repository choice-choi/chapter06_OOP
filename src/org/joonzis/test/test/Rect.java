package org.joonzis.test.test;

import java.util.Scanner;

/*
	Q2.
		클래스 Rect
		- 필드 : width, height
		- 메소드 : info, calcArea(넓이계산)
		클래스 RectMain
		- 메소드 : main
		값을 입력 받아서 (Scanner) 확인
*/

public class Rect {
	Scanner scanner;						// new가 없으면 아직 scanner가 완벽하게 생성된게 아님!
	int width;
	int height;
	
	void init() {
		scanner = new Scanner(System.in);	// 이런 방식은 좋은 방식이 아님!!(scanner는 클래스 말고 메인으로 넣자!)
		System.out.println("너비 입력>>");
		width = scanner.nextInt();
		System.out.println("높이 입력>>");
		height = scanner.nextInt();
	}
	void calcArea() {
		System.out.println("크기 : " + width * height);
	}
	
	void info() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		calcArea();
	}
	
}
