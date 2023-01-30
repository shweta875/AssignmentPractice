package com.velocity;

import java.util.Scanner;

public class Steel {

	public static void main(String[] args) {
		int hh,ts,cc;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hardness");
		hh=sc.nextInt();
		System.out.println("enter the carbon content ");
		cc=sc.nextInt();
		System.out.println("enter the tensile stre");
		ts=sc.nextInt();
		if(hh>50&&cc<0.7&&ts>5600) {
			System.out.println("grade 10");
		} 
		else if(hh>50&&cc>0.7&&!(ts>5600)) {
			System.out.println("grade 9");
			}
		else if(hh>50&&cc<0.7&&ts>5600) {
			
		}
		else if(hh>50&&cc<0.7&&ts>5600){
			
		}
		System.out.println("shweta made cahnges");
		
		
		

	}

}
