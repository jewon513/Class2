package com.biz.jack.service;

import java.util.List;
import java.util.Scanner;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.utils.BlackJackUtils;

public class GameServiceV1 {

	DeckServiceV1 ds;
	List<DeckVO> deckList;
	Scanner scan;
	
	public GameServiceV1() {
		ds = new DeckServiceV1();
		ds.makeDeck();
		deckList = ds.getDeck();
		scan = new Scanner(System.in);
		
	}

	public boolean gameStart(String playerName) {
		System.out.println(BlackJackUtils.getStringLong("=", 50));
		System.out.println("Game Start");
		System.out.println(BlackJackUtils.getStringLong("=", 50));
		
		PlayerServiceV1 dealer = new PlayerServiceV1(deckList);
		PlayerServiceV1 user = new PlayerServiceV1(deckList, playerName);
		
		for (int i = 0; i < 2; i++) {
			dealer.hit();
			user.hit();
		}
		
		while(true) {
			
//			if(user.sumValue()>21) break;
			
			
			System.out.println("===========================================");
			System.out.println("1.hit         2.stand         3.end");
			System.out.println("===========================================");
			System.out.println("선택 >> ");
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			
			if(intM == 1) {
				dealer.hit();
				user.hit();
			}else {
				if(user.sumValue() == dealer.sumValue()) {
					System.out.println("딜러 승리");
				}else if (user.sumValue() > dealer.sumValue()) {
					System.out.println(playerName + " 승리");
				}else {
					System.out.println("dealer 승리");
				}
				System.out.println(BlackJackUtils.getStringLong("*", 100));
				System.out.println("딜러 점수 : " + dealer.sumValue());
				System.out.println(playerName + " : " +user.sumValue());
				System.out.println(BlackJackUtils.getStringLong("*", 100));
				if(intM==2) return true;
				else if(intM==3) return false;
			}
			if(user.sumValue()>21) {
				System.out.println("딜러 승리");
			}
			if(dealer.sumValue()>21) {
				System.out.println(playerName + " 승리");
			}
			System.out.println("아무키나 누르세요.....");
			scan.nextLine();
		}
	
		
	}
	
}
