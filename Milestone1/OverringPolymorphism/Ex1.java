package OverringPolymorphism;

class Fruit
{
	String name,taste;
	int size;
	void eat()
	{
		System.out.println("name "+name+" taste "+taste+" size "+size+" 10cm");
	}
}
class Apple extends Fruit
{
	void eat()
	{
		System.out.println("apple tast sweet size 10 cm");
	}
}
class Orange extends Fruit
{
	void eat()
	{
		System.out.println("Orange tast sour size 10 cm");
	}
}
public class Ex1 {
public static void main(String[] args) {
	Apple a =new Apple();
	Orange o=new Orange();
	a.eat();
	o.eat();
	Fruit f= new Fruit();
	f.name="watermelon";
	f.size=10;
	f.taste="nice";
	f.eat();
}
}