package com.biz.jack.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.biz.jack.domain.DeckVO;

/*
 * 게임에서 사용할 1벌의 게임카드를 생성
 */

public class DeckServiceV1 {

	List<DeckVO> deckList;
	
	private String[] suit = new String[] {"다이아몬드","하트","스페이드","클로버"};
	private String denomination = "A234567890KQJ";
	
	public DeckServiceV1() {
		this.deckList = new LinkedList<DeckVO>();
	}
	
	public List<DeckVO> getDeck(){

		for(DeckVO vo : deckList) {
			Collections.shuffle(deckList);	
		}
		return this.deckList;
	}
	
	
	public void makeDeck() {
		String[] denoms = denomination.split("");
		for(String suit : suit) {
			for(String denom :denoms) {
				
				//각 카드가 갖게될 value를 생성하고 value값은 denoms를 기준으로 생성한다.
				//2~9까지는 그대로
				//A는 1로 JKQ는 10으로
				
				int intValue = 0;
				
				try {
					intValue = Integer.valueOf(denom);
					if(intValue == 0) intValue = 10;
				} catch (Exception e) {
					if(denom.equals("A")) intValue=1;
					else intValue = 10; 
				}
				
				DeckVO dVO = new DeckVO();
				dVO.setSuit(suit);
				dVO.setDenomination(denom);
				dVO.setValue(intValue);
				
				deckList.add(dVO);
				
			}
		}
	}
	
	
	
	
}
