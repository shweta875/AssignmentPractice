package com.velocity;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
	    int cur_year,joi_year;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter current year");
	    cur_year=sc.nextInt();
	    System.out.println("enter joining year");
	    joi_year=sc.nextInt();
	    int ser=cur_year-joi_year;
	    if(ser>3) {
	    	System.out.println("employee will get bonus of 2500 rs.");
	    }

	}

}
