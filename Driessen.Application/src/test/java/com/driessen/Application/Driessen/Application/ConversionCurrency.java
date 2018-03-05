package com.driessen.Application.Driessen.Application;

public class ConversionCurrency {
	
	public static void main(String arg[]) {
		
		getAmount(55);
	}
	
	public static void getAmount(int n){
		
		String output="";
		
		while(n>0) {
						
			if(n>=2000) {
				
				String mod=Integer.toString(n/2000);
				output=output+mod+"*"+Integer.toString(2000)+",";
				n=n%2000;
				
			}else if(n>=500) {
				//output=output+",";
				String mod=Integer.toString(n/500);
				output=output+mod+"*"+Integer.toString(500)+",";
				n=n%500;
				
			}else if(n>=200) {
				//output=output+",";
				String mod=Integer.toString(n/200);
				output=output+mod+"*"+Integer.toString(200)+",";
				n=n%200;
				
			}else if(n>=100) {
				//output=output+",";
				String mod=Integer.toString(n/100);
				output=output+mod+"*"+Integer.toString(100)+",";
				n=n%100;
				
			}else if(n>=50) {
				//output=output+",";
				String mod=Integer.toString(n/50);
				output=output+mod+"*"+Integer.toString(50)+",";
				n=n%50;
				
			}else if(n>=20) {
				//output=output+",";
				String mod=Integer.toString(n/20);
				output=output+mod+"*"+Integer.toString(20)+",";
				n=n%20;
				
			}else if(n>=10) {
				//output=output+",";
				String mod=Integer.toString(n/10);
				output=output+mod+"*"+Integer.toString(10)+",";
				n=n%10;
				//break;
			}else if(n>=5) {
				//output=output+",";
				String mod=Integer.toString(n/5);
				output=output+mod+"*"+Integer.toString(5)+",";
				n=n%5;
				//break;
			}else if(n==2) {
				//output=output+",";
				String mod=Integer.toString(n/2);
				output=output+mod+"*"+Integer.toString(2);
				n=n%2;
				//break;
			}else if(n==1) {
				//output=output+",";
				String mod=Integer.toString(n/1);
				output=output+mod+"*"+Integer.toString(1);
				break;
			}
			
			
		}
		
		System.out.println(output);
	}

}
