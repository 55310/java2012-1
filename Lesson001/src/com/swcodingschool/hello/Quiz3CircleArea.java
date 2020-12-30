package com.swcodingschool.hello;

import java.util.Scanner;

/*
 * 원의 반지름을 입력받아 면적을 구하는 
 * 프로그램을 작성하시오. 
 */
public class Quiz3CircleArea {

	public static void main(String[] args) {
		final double PI = 3.141592;  // Constant 상수
		Scanner sc = new Scanner(System.in);
		System.out.printf("원의 반지름(실수형) : ");
		// 의미를 담아 변수명을 정하세요!!
		double radius = sc.nextDouble();  

		double circleArea = radius * radius * PI;
		
		System.out.printf("반지름 %5.1f인 원의 넓이는 %10.2f", 
				radius, circleArea);
	}

}
