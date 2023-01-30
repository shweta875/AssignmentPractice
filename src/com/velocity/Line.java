package com.velocity;

import java.util.Scanner;

public class Line {

	public static void main(String[] args) {
		int s1,s2,s3,s4,s5;
		double percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of student in subject1");
		s1=sc.nextInt();
		System.out.println("Enter the marks of student in subject2");
		s2=sc.nextInt();
		System.out.println("Enter the marks of student in subject3");
		s3=sc.nextInt();
		System.out.println("Enter the marks of student in subject4");
		s4=sc.nextInt();
		System.out.println("enter the marks of student in subject5");
		s5=sc.nextInt();
		
		System.out.println(percentage=(s1+s2+s3+s4+s5)*0.2);
		if(percentage>=60)
			System.out.println("First division");
		else if(percentage>=50&&percentage<=59)
			System.out.println("second division");
		else if(percentage>=40&&percentage<=49)
			System.out.println("third division");
		else if(percentage<40)
			System.out.println("fail");
		
		

	}

}
