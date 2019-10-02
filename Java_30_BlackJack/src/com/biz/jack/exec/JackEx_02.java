package com.biz.jack.exec;

import java.util.List;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.service.DeckServiceV1;
import com.biz.jack.service.PlayerServiceV1;

public class JackEx_02 {

	public static void main(String[] args) {

		DeckServiceV1 deck = new DeckServiceV1();
		
		deck.makeDeck();
		List<DeckVO> deckList = deck.getDeck();
		
		PlayerServiceV1 dealer = new PlayerServiceV1(deckList);
		PlayerServiceV1 hong = new PlayerServiceV1(deckList, "hong");
		
		dealer.hit();
		hong.hit();
		dealer.hit();
		hong.hit();
		
		if(dealer.sumValue()<17) dealer.hit();
		hong.hit();
		
		
		
		
	}

}
