package com.generic;

public class MultipleParameter<T, U> {
	T t;
	U u;
	
		public MultipleParameter(T t, U u) {
		//super();
		this.t = t;
		this.u = u;
	}

		public T getT() {
			return t;
		}


		public void setT(T t) {
			this.t = t;
		}


		public U getU() {
			return u;
		}


		public void setU(U u) {
			this.u = u;
		}

	public static void main(String[] args) {
MultipleParameter<Integer, String> mulp=new MultipleParameter<Integer, String>(101, "Rohit");
		MultipleParameter<Integer, String> mulp1=new MultipleParameter<Integer, String>(102, "Amit");
System.out.println("Employe Information of First Employee");
System.out.println("Id "+mulp.getT()+" Name "+mulp.getU());
System.out.println("Employe Information of Second Employee");
System.out.println("Id "+mulp1.getT()+" Name "+mulp1.getU());
		}
}
