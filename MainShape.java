
class Shape {
	
	public void draw() { System.out.println("Drawing shape"); }
	public void erase() { System.out.println("Erasing shape"); }

}

class Circle extends Shape {
	
	public void draw() {
		
		System.out.println("Drawing Circle");
		
	}
	
	public void erase() {
		
		System.out.println("Erasing Circle");
		
	}
	
}

class Triangle extends Shape {
	
	public void draw() {
		
		System.out.println("Drawing Triangle");
		
	}
	
	public void erase() {
		
		System.out.println("Erasing Triangle");
		
	}
}

class Square extends Shape {
	
	public void draw() {
		
		System.out.println("Drawing Square");
		
	}
	
	public void erase() {
		
		System.out.println("Erasing Square");
		
	}
	
}

class MainShape {
	
	public static void main(String args[]) {
	
	Shape c = new Circle();
	Shape t = new Triangle();
	Shape s = new Square();
	
	c.draw();
	c.erase();
	
	t.draw();
	t.erase();
	
	s.draw();
	s.erase();
	
	}
}
