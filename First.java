package com.training;

public class First {

	public static void main(String[] args) {
		
		String str1="@gmail.com";
	       int n=args[0].length();
	       
	       
	       String str2=args[0].substring(n-10,n);
	       
	       if(str1.equals(str2))
	       {
	        System.out.println("valid mail ID");
	       }
	       else
	    	   System.out.println("Invalid Mail ID");
	    }

	}


