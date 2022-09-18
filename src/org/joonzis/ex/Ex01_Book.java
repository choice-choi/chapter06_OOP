package org.joonzis.ex;

// 클래스의 구성
// 필드(변수), 메소드(함수)


public class Ex01_Book {
	//*필드 4개, 메소드 1개
	
	// 필드
	String title;
	String writer;
	int price;
	boolean isBestSeller;
	
	// 메소드 (받은 정보를 출력하기만 하고 실행 못 함, 메인 메소드가 없기 때문임. 따라서 다른 클래스에서 얘를 실행시켜줘야함)
	void info() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
		System.out.println(isBestSeller ? "베스트셀러" : "일반서적");
	}

	
	
	

}
