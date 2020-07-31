package com.wipro.Exception_handling;


import java.util.Scanner;

class MyException extends Exception 
{ 
	MyException(String s)
	{
		super(s);
	}
   
} 

public class Ex3 {

	 public static boolean validate(int n)
	    { 
	        if(n<0||n>100)
	        {
	        	return false;
	        }
	        return true;
	    } 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			String s;
			s=sc.next();
			int sum=0;
			try {
				int marks[]=new int[3];
				
				boolean  b;
				for(int j=0;j<3;j++)
				{
					int n=sc.nextInt();
					
				b=validate(n);
				if(b==true)
				{
					marks[j]=n;
					sum+=marks[j];
					
				}
				else
				{
					throw new MyException("Invalid number");
				}
				}
				System.out.println("Student  "+s+" scored average: "+(sum/3));
			}
			catch(Exception e){
			    System.out.println("Invalid number");
		//	System.out.println(e);	
			}
		}
	}
}
