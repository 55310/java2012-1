package com.swcodingschool.oop;
/*
 * 매장이 하나 있고, 매장과 거래하는 손님들이 있다.
 * 매장은 싱글톤패턴으로 구현하고, 다수의 손님들이
 * 물건을 구매한다.
 * 이를 객체 지향 프로그램으로 시뮬레이션 해보자.
 * 손님QuizStaticGuest : 손님ID, money
 * 매장QuizStaticStore : 손님카운트, money
 */
public class QuizStaticTest {
	public static void main(String[] args) {
		// static, 싱글톤 클래스 확인
		QuizStaticStore store1 = QuizStaticStore.getInstance();
		QuizStaticStore store2 = QuizStaticStore.getInstance();
		System.out.println(store1);
		System.out.println(store2);
		QuizStaticStore.showStoreInfo();
		
		
		QuizStaticGuest guest1 = new QuizStaticGuest(100000);
		QuizStaticGuest guest2 = new QuizStaticGuest(100000);
		guest1.buy(store1, 10000);
		guest1.showInfo();
		store1.showStoreInfo();
		guest2.buy(store2, 30000);
		guest2.showInfo();
		store2.showStoreInfo();
		
	}// end of main
}// end of class
