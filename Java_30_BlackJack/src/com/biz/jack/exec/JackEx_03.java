package com.biz.jack.exec;

import com.biz.jack.service.GameServiceV1;

public class JackEx_03 {

	public static void main(String[] args) {

		GameServiceV1 gs = new GameServiceV1();
		
		while(true) {
			if(gs.gameStart("user")==false) break;	
		}
		System.out.println("Game Over");
		
		
		
		
		
		
	}

}
