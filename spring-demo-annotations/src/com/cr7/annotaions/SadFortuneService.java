package com.cr7.annotaions;

import org.springframework.beans.factory.annotation.Value;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is a sad day";
	}

}
