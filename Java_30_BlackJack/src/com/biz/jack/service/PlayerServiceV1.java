package com.biz.jack.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.jack.domain.DeckVO;

public class PlayerServiceV1 {
	
	private List<DeckVO> myDeckList;
	private List<DeckVO> pubDeckList;
	
	private String playerName;
	
	public PlayerServiceV1(List<DeckVO> deckList) {
		this(deckList,"딜러");
	}
	
	public PlayerServiceV1(List<DeckVO> deckList, String playerName) {
		myDeckList = new ArrayList<DeckVO>();
		this.pubDeckList = deckList;
		this.playerName = playerName;
	}
	
	// 자신이 받은 카드의 점수를 계산하는 method
	public int sumValue() {
		int sumValue=0;
		for(DeckVO vo : myDeckList) {
			sumValue+=vo.getValue();
		}
		return sumValue;
	}
	
	// 각 player들이 hit 했을때 수행할 method
	public void hit() {
		if(this.playerName.equals("딜러") && this.sumValue()>16) {
			System.out.printf("딜러점수 : %d\n" , this.sumValue());
			System.out.println("딜러 hit 금지");
		}else {
			myDeckList.add(pubDeckList.get(0));
			pubDeckList.remove(0);
		}
		
		System.out.println("========================================");
		System.out.println(this.playerName);
		System.out.println("========================================");
		for(DeckVO vo : myDeckList) {
			System.out.println(vo);
		}
		System.out.println("----------------------------------------");
		System.out.println("현재 점수 : " + this.sumValue());
		
	}

}
