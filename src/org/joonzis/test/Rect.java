package org.joonzis.test;

import java.util.Scanner;

// 클래스 : Rect
// 필드 : width, height
// 메소드 : init(너비, 높이 입력), info(너비, 높이, 크기(calcArea) 출력), calcArea(w*h, 넓이계산(크기) 출력)

public class Rect {
	//init에서 스캐너 사용하기
	Scanner scanner;						// new가 없으면 아직 scanner가 완벽하게 생성된게 아님!
	int width;	//클래스 것, 전역변수
	int height;
	
	void init() {
		scanner = new Scanner(System.in);	// 이런 방식은 좋은 방식이 아님!!(scanner는 클래스 말고 메인으로 넣자!)
		
		System.out.println("너비 입력>>");
		width /*지역변수*/ = scanner.nextInt();
		
		System.out.println("높이 입력>>");
		height = scanner.nextInt();
	}
	void calcArea() {	// 너비와 높이 따로 출력
		System.out.println("크기 : " + width * height);
	}
	
	void info() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		calcArea();
	}
	
}



