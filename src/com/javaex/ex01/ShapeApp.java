package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape클래스의 abstract를 지우거나 new Shape를 사용하지않아야 오류가 발생하지 않는다.
		Shape s = new Shape("빨강");
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		//sr1의 가로크기 출력
		//Ractangle 에서 가로의 크기를 가져와야하므로 getter를 사용
		System.out.println("sr1의 가로는 " +((Ractangle)sr1).getWidth() + " 입니다.");
		
	}
}

	
	