package com.hans.msf;

import org.springframework.stereotype.Component;

@Component
public class SubtractProducer implements IMSFProducer {

	@Override
	public String produceRandomString() {
		// TODO Auto-generated method stub
		return "Substract";
	}

}
