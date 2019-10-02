package com.biz.jack.domain;

/*
 * Playing CARD (Joker를 제외한 52장) 이 1SET
 * suit : 빨강(◆ , ♥) 검정(♠ , ♣)
 * denomination : A, 2~10, J, K, Q 
 */
public class DeckVO {

	private String suit;
	private String denomination;
	int value;
	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "[suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
	}
	
	
}
