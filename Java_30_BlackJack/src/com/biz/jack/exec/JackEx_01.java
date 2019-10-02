package com.biz.jack.exec;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.service.DeckServiceV1;

public class JackEx_01 {

	public static void main(String[] args) {

		DeckServiceV1 deck = new DeckServiceV1();
		
		deck.makeDeck();
		
		for(DeckVO vo : deck.getDeck()) {
			System.out.println(vo);
		}
		
	}

}
