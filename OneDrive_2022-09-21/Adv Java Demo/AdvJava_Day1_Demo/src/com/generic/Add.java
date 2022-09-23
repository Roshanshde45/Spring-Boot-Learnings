package com.generic;

public class Add implements GenericInterface<Integer, Integer> {
	int t;
	int t1;

	public void add(Integer t,Integer t1) {
		this.t = t;
		this.t1=t1;
	}

	public int get() {
		return t+t1;
	}
	

}
