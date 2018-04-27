package com.driessen.Application.Test;

public class ReverseNumberRecursion {
	
	public static void main(String arg[]) {
		
		reverseMethod(1253);
	}

	private static void reverseMethod(int i) {
		// TODO Auto-generated method stub
		
		if(i<10) {
			System.out.println(i);
			
		}else {
			System.out.print(i%10);
			reverseMethod(i/10);
		}
		
	}

}
