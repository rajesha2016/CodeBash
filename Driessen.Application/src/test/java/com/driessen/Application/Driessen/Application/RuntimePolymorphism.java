package com.driessen.Application.Driessen.Application;

public class RuntimePolymorphism {
	
	 	public static void main(String args[]) {
			
			Base b=new Base();
			b.move();
			
			Child c=new Child();
			c.move();
			
			Base cc=new Child();
			cc.move();
			System.out.println(cc.b);// access base class variable because variables never override
			
			Base d;
			d=b;
			d.move();
			
		}
	
}

class Base{
	
	int b=10;
	 void move() {
		System.out.println("IN BASE CLASS");
	}
}


class Child extends Base{
	int b=20;
	 void move() {
		System.out.println("in child class");
	}
}

class SuperChild extends Child{
	void move() {
		System.out.println("inside super child");
	}
}