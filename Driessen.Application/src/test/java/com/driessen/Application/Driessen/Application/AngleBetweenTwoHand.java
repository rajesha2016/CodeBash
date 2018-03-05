package com.driessen.Application.Driessen.Application;

public class AngleBetweenTwoHand {
	
	public static void main(String arg[]) {
		System.out.println(calculateAngle(2,30)+" degree");
	}
	
	public static int calculateAngle(int hour,int minute) {
		
		if(hour<0 || minute<0 || hour>12 || minute>60) {
			System.out.println("invalid input");
		}
		
		if(hour==12)
			hour=0;
		if(minute==60)
			minute=0;
		
		int h_angle=(int)0.5*(hour*60+minute);
		int m_angle=6*minute;
		
		int angle=Math.abs(h_angle-m_angle);
		
		angle=Math.min(360-angle, angle);
		
		return angle;
	}

}
