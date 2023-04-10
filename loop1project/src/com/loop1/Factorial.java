package com.loop1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fact=1;
		System.out.println("enter the number");
		long number=sc.nextLong();
		
        for(int i=2;i<=number;i++) {
        	fact*=i;
        	
        }
   System.out.println("factorial :"+fact);
       
	}

}
