package com.wipro.IO;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the filename");
	String file=sc.nextLine();
	System.out.println("Enter the character to count its occurences");
	char c= sc.next().charAt(0);
	try {
	BufferedReader br= new BufferedReader(new FileReader(file));
	int ch;
	int count=0;
	while((ch=br.read())!=-1) {
		if(Character.toLowerCase((char)ch)==Character.toLowerCase(c)) {
			count++;
		}
	}
	System.out.println("File '" + file + "' has " +
			 count+ " instances of letter '" + c + "'.");
	br.close();
	}
	catch(Exception e){
		System.out.println(e);
	}
	sc.close();
	}	
}