package com.generic;
import java.util.*;
public class GenericCotainer<T> {
	T t;
	
	public GenericCotainer() {
		// TODO Auto-generated constructor stub
	}

	public T getT() {
		return t;
	}



	public void setT(T t) {
		this.t = t;
	}
	public static void main(String[] args) {
	GenericCotainer<String> gcs=new GenericCotainer<>();
		GenericCotainer<Integer> gci=new GenericCotainer<>();
		gcs.setT("Ravic");
		//gcs.setT(10); type safety and comile time checking
		gci.setT(20);
		Integer a=gci.getT();
		System.out.println("Generic String value is "+gcs.getT());
		System.out.println("Generic Integer value is "+a);
	
	
	
			
	}

}
