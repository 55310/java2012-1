package com.swcodingschool.oop;
/*
 * 객체간 상호작용 연습문제
 */
public class QuizStaticGuest {
	static int serialNum = 1000;
	public int guestID;
	public int money;
	
	QuizStaticGuest(int money){
		serialNum++;
		this.guestID = serialNum;
		this.money = money;
	}// 인수로 받은 돈으로 초기화
	
	public void buy(QuizStaticStore store, int money) {
		store.sell(money);
		this.money -= money;
	}
	
	public void showInfo() {
		System.out.println("GuestID : " + guestID + 
				", Money :" + this.money);
	}
}
