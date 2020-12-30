package com.swcodingschool.oop;
/*
 * 함수의 정의와 호출을 디버깅을 통해 확인한다.
 * 변수의 영향 범위 scope
 * local variable 지역변수
 * global variable 전역변수  ~= class variable
 * class변수 선언시 static 키워드를 사용한다.
 */
public class FunctionTest {
	
	static int global = 0;

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		global++;
		System.out.println("in main : " + global);
		
		int sum = add(num1, num2);
		System.out.println(sum);

	}//end of main
	
	public static int add(int n1, int n2) {
		global++;
		System.out.println("in add : " + global);
		
		return n1 + n2;
	}

}// end of class
