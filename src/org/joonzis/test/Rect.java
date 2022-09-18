package org.joonzis.test;

import java.util.Scanner;

// 클래스 : Rect
// 필드 : width, height
// 메소드 : init(너비, 높이 입력), info(너비, 높이, 크기(calcArea) 출력), calcArea(w*h, 넓이계산(크기) 출력)


public class Rect {

	//init에서 스캐너 사용
	
	double width;	//클래스 것, 전역변수
	double height;
	
	
    
	
	void init() {	//init 메소드
		Scanner sc = new Scanner(System.in);
		System.out.println("너비 입력 >> " );
		width /*지역변수*/ = sc.nextDouble(); 
		
		
		System.out.println("높이 입력 >> ");
		height = sc.nextDouble(); 
	}
	
	void info() {
		// 출력 2개
		System.out.println("init : " + width + height);
		System.out.println("info : " + width + height + calcArea);
		System.out.println("calcArea : " + width + (width * height));
		
	}
	
	void calcArea() {
		// 너비와 높이 따로 출력
		
	}
	
	
	
	
}


