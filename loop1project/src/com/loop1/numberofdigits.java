package com.loop1;
import java.util.Scanner;
public class numberofdigits {

	public static void main(String[] args) {
	        
		  int n,m,a,i=1,counter=0;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter any number:");
		  n=sc.nextInt();
		  m=n;
		  while(n>0)
		  {
			  n/=10;
			  counter++;
			  
		  }
		  while(m>0)
		  {
			  a=m%10;
			  System.out.println("digits at position"+counter+":"+a);
			  m/=10;
			  counter--;
		  }

	}

}
