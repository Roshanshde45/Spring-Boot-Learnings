package com.generic;
import java.util.List;
import java.util.ArrayList;
public class ObjectContainer {
	
	private Object obj;
	public Object getObj() {
		return obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}

	public static void main(String[] args) {
		
	ObjectContainer obj=new ObjectContainer();
		obj.setObj("Ravic");
		
		System.out.println("String Object "+obj.getObj());
		obj.setObj(10);//It is not type safe
		
		Integer a=(Integer)obj.getObj(); // need to typecast
		System.out.println("Integer Object "+a);
	
		}

}
