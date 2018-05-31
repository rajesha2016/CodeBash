package com.driessen.Application.Test;

public class PrimeNumbers {
	
	public static void main(String args[]) {
		
		getPrimenumbers(12);
	}

	private static void getPrimenumbers(int i) {
		// TODO Auto-generated method stub
		
		String output="";
		int num=0;
		if(i<=0) {
			System.out.println("Invalid entry");
		}
		
		for(int n=1;n<i;n++) {
			
			int count=0;
			for(num=n;num>=1;num--) {
				
				if(n%num==0) {
				
					count=count+1;
				
				}
			}
			if(count==2) {
				output=output+n+",";
			}
			
		}
		System.out.println("prime numbers are: "+output);
		
	}

}
