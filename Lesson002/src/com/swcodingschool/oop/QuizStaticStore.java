package com.swcodingschool.oop;
/*
 * singletone pattern 클래스 이해와 활용
 */
public class QuizStaticStore {
	// 단계 2. 클래스 내부에 static으로 유일한 
	//         인스턴스 생성하기
	private static QuizStaticStore instance = new QuizStaticStore();
	private static int money = 1000000;
	private static int guestCount = 0;
	
	// 단계 1. 생성자를 private로 만들기
	private QuizStaticStore() {
		
	}
	
	// 단계 3. 외부에서 참조할 수 있는 public 메서드 제공
	public static QuizStaticStore getInstance() {
		if(instance == null) {
			instance = new QuizStaticStore();
		}
		return instance;
	}
	
	public static void sell(int money) {
		instance.money += money;
		guestCount++;
	}
	
	public static void showStoreInfo() {
		System.out.println("#of guests : " + guestCount + 
				",  money : " + money);
	}
}// 
