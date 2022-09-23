package com.generic;
public class GenericConstructor<T> {
	T t;

	public GenericConstructor(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
public static void main(String args[])
{
	GenericConstructor<String> obj1=new GenericConstructor<String>("Ravic");
	System.out.println("String value "+obj1.getT());
	GenericConstructor<Integer> obj2=new GenericConstructor<Integer>(10);
	System.out.println("Integer value "+obj2.getT());
}
	
}
