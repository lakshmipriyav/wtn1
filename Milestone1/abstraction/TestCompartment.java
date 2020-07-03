package com.wipro.abstraction;
import java.util.*;

abstract class Compartment
{
	abstract String notice();
}
class FirstClass extends Compartment
{
	public String notice()
	{
		return "First class compartment";
	}
}

class Ladies extends Compartment
{
	public String notice()
	{
		return "Ladies compartment";
	}
}

class General extends Compartment
{
	public String notice()
	{
		return "General compartment";
	}
}

class Luggage extends Compartment
{
	public String notice()
	{
		return "Luggage compartment";
	}
}

public class TestCompartment {
	public static void main(String[] args)
	{
		Random r =new Random();
		Compartment c[]= new Compartment[10];
		for(int i=0;i<10;i++)
		{
			int num=r.nextInt(5);
			if(num==1)
			{
				c[i]=new FirstClass();
			}
			else if(num==2)
			{
				c[i]=new Ladies();
			}
			else if(num==3)
			{
				c[i]=new General();
			}
			else if(num==4)
			{
				c[i]=new Luggage(); 
			}
			else if(num==0)
				continue;
			System.out.println(c[i].notice());
		}
	}
}
