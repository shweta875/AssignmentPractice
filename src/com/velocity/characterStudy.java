package com.velocity;

import java.util.Scanner;

public class characterStudy {

	public static void main(String[] args) {
	char ch;
	System.out.println("enter the character");
	Scanner sc=new Scanner(System.in);
	ch=sc.next().charAt(0);
	if(ch>=65&&ch<=90)
		System.out.println("this is alphabet");
	else if(ch>=97&&ch<=122)
		System.out.println("this is lower case alphabet");
	else if(ch>=48&&ch<=57)
		System.out.println("this is number");
	else if(ch>=0&&ch<=47||ch>=58&&ch<=64||ch>=91&&ch<=96||ch>=123&&ch<=127)
		System.out.println("it is special character");
	else System.out.println("others");
	
	}

}
