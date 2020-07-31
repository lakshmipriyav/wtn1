package com.wipro.Exception_handling;

public class Ex2 {
	public static void main(String[] args) {
		int n=args.length;
		int sum=0;
		try
		{
			for (int i=0;i<n;i++)
			{
				sum+=Integer.parseInt(args[i]);
			}
			System.out.println("Avarage is "+sum/n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
