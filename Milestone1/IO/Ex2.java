package com.wipro.IO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the input file name ");
	String in=sc.nextLine();
	System.out.println("Enter the output file name");
	String out=sc.nextLine();
	try {
	BufferedReader br = new BufferedReader(new FileReader(in));
	BufferedWriter bw= new BufferedWriter(new FileWriter(out));
	String ch;
	while((ch=br.readLine())!=null) {
		bw.write(ch);
	}
	br.close();
	bw.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	sc.close();
}
}