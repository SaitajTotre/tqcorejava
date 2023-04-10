package com.arr;
import java.util.Arrays;
public class SecondMaxvalue {
	
		public static int getSecondLargest(int[] a, int total){  
		Arrays.sort(a);  
		return a[total-2];  
		}  
		public static void main(String args[]){  
		int a[]={20,0,31,45,100,1,105,90};  
		
		System.out.println("Second Largest: "+getSecondLargest(a,8));  
	
		}
		
}
