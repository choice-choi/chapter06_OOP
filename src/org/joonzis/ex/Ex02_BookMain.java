package org.joonzis.ex;

/*
 * 메인 클래스
 * 1. main method가 있는 클래스이다.
 */

public class Ex02_BookMain {

	public static void main(String[] args) {
		
		
		// 1. Book 객체(인스턴스) 생성
		Ex01_Book myBook = new Ex01_Book();	//내가 사용할 클래스의 객체 생성 식
		//클래스(데이터타입) / 객체(변수) = new(새로만들때 사용하는 명령어) / 생성자 메소드(클래스 명이랑 똑같지만 괄호만 붙어있음)
		
		
		// 2. 생성된 객체 활용
		// (데이터 클래스)
		myBook.title = "자바의 정석";
		myBook.writer = "남궁성";
		myBook.price = 35000;
		myBook.isBestSeller = true;
		

		myBook.info();	//Ex01_Book 여기서 만들어 둔 메소드 부르는 식
		//	자원: 필드와 메소드
		
	}

}
