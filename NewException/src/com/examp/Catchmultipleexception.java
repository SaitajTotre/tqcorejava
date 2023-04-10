package com.examp;

public class Catchmultipleexception {
	public static void main(String args[]){    
        try{    
            int array[] = newint[10];    
            array[10] = 30/0;    
        }    
        catch(ArithmeticException e){  
            System.out.println(e.getMessage());  
        }    
        catch(ArrayIndexOutOfBoundsException e){  
            System.out.println(e.getMessage());  
        }    
        catch(Exception e){  
            System.out.println(e.getMessage());  
        }    
     }    
}
