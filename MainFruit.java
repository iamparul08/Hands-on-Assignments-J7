

import java.util.*;

class Fruit {
	
	String name, taste, size;
	
	public void eat() {	//overridden method
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the name of the Fruit- "); 
		name = s1.nextLine();
		
		System.out.println("Enter the taste of the fruit- ");
		taste = s1.nextLine();
		
		System.out.println("Enter the size of the fruit- ");
		size = s1.nextLine();
		
		
		}
		
}

class Apple extends Fruit {	
	
	public void eat() { 		//overriding method
		
		System.out.println("Name of the fruit is Apple.");
		System.out.println("Taste of an apple is sweet.");
	
	}
	
}

class Orange extends Fruit {	
	
	public void eat() { 		//overriding method
	
		System.out.println("Name of fruit is Orange.");
		System.out.println("Taste of orange is sour.");
		
	}
	
}

class MainFruit {
	
	public static void main(String args[]) {
		
		Apple a = new Apple();
		a.eat();
		
		Orange o = new Orange();
		o.eat();
	}
}
