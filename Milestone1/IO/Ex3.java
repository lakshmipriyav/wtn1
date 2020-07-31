package com.wipro.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex3 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the input file");
	String in= sc.nextLine();
	System.out.println("Enter the output file");
	String out= sc.nextLine();
	try {
		BufferedReader br= new BufferedReader(new FileReader(in));
		BufferedWriter bw= new BufferedWriter(new FileWriter(out));
		Map<String,Integer>m= new TreeMap<String,Integer>();
		String line;
		while((line=br.readLine())!=null) {
			line=line.trim();
			String [] words =line.split(" ");
			for(String word:words) {
				if(!m.containsKey(word)) {
					m.put(word, 1);
				}
				else {
					m.put(word,m.get(word)+1);
				}
			}
		}
		for(Map.Entry<String, Integer> e : m.entrySet()) {
			bw.write(e.getKey() +":"+ e.getValue()+ "\n" );
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