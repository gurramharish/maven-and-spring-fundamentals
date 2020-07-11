package com.hans.msf;

public class MSFFactory {

	Adder adder;
	static MSFFactory msfFactory;

	public Adder getAdder() {
		if (adder == null) {
			adder = new Adder();
		}
		return adder;
	}

	public static MSFFactory getInstance() {
		if (msfFactory != null) {
			msfFactory = new MSFFactory();
		}
		return msfFactory;
	}
}
