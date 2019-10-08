package com.biz.classes.exec;

import com.biz.classes.service.children.RadioClassV2;
import com.biz.classes.service.children.TVClassV2;
import com.biz.classes.service.parents.RemoconABSV2;

public class RemoconEx_02 {

	public static void main(String[] args) {

		
		
		RemoconABSV2 tv = new TVClassV2();
		RemoconABSV2 radio = new RadioClassV2();
		
		tv.setName("TV");
		tv.power();
		tv.volUp();
		tv.volDown();
		tv.ChUp();
		tv.ChDown();
		
		radio.setName("radio");
		radio.power();
		
	}

}
