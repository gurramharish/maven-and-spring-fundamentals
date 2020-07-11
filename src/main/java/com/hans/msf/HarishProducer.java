package com.hans.msf;

import org.springframework.stereotype.Service;

@Service
public class HarishProducer implements IMSFProducer {

	@Override
	public String produceRandomString() {
		// TODO Auto-generated method stub
		return "Harish";
	}

}
