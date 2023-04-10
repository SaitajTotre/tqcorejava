package com.examp;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int num1=8;
		int num2=0;
		try
		{
			int result=num1/num2;
			System.out.println("result:"+result);
			
		}
		catch (ArithematicException e)
		{
			System.out.println("Exception occured :"+e.getMessage());
		}
		System.out.println("hello java");
		
		
	}

}
