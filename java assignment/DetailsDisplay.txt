package com.cts.training.basic;

import java.util.Scanner;

public class DetailsDisplay {
	public static void main(String args[]) {
		
	String name,temp;
	int age;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name:");
	 temp=sc.nextLine();
	 
	 /*for (char c : name.toCharArray()) {
		    if (!Character.isAlphabetic(c)){
		        System.out.println("INVALID");
		        break;
		       }
		    else {
		    	
		    }
		    }*/
	System.out.println("Enter age:");
	 age=sc.nextInt();
	 
	 System.out.print("Hello, My Name is :"+temp+"\n");
	 System.out.print("My age is:"+age);
	 