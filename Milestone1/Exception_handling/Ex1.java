package com.wipro.Exception_handling;
import java.util.Scanner;
public class Ex1 {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in the array:");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the elements in the array:");
	try {
	for(int i=0;i<size;i++)
	{
		a[i]=Integer.parseInt(sc.next());
	}}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("Enter the index of the array to access");
	try{
		int ind=sc.nextInt();
		System.out.println("The array element at the index "+ind+" is "+a[ind]);
	   }
	catch(Exception e){
		System.out.println(e);
	}
	
	}
	
}
