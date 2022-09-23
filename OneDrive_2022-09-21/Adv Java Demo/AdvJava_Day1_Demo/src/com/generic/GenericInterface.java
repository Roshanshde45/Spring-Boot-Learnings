package com.generic;

public interface GenericInterface<T,U> {
	public void add(T t,U u);

			
}

/*class Box implements GenericInterface<Integer> {
	int t;

	public void add(Integer t) {
		this.t = t;
	}

	public int get() {
		return t;
	}
}*/
