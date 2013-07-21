import java.awt.Color ;
import java.awt.Point ;
import java.math.*;

public class Prog {
	public static void main(String[] args) {
		/**
		  Make a test color 
		*/
		Color fill ;
		fill = Color.BLUE ;
		
		GuiRegShape s = new Square( 5, "square1" ) ;
		System.out.print("We have " + s.label() + " with a length of " + s.length() + " at coordinates (0,0)\n");
		s.move(8,4);
		System.out.print(s.label() + " is now at " + s.location() + "\n");
		s.color( Color.ORANGE ) ;
		System.out.print(s.label() + " is now " + s.color() + " in color\n");
		System.out.print(s.label() + " has a area of " + s.area() + "\n");
		if(testEquality(s.area(), 5*5)) {
			System.out.print("It passes the Area Equality test\n");
		}
		System.out.print(s.label() + " has a perimeter of " + s.perimeter() + "\n");
		if(testEquality(s.perimeter(), 4*5)) {
			System.out.print("It passes the Perimeter Equality test\n");
		}
		GuiRegShape s2 = new Square( 4, "square2", fill ) ;
		System.out.print("We have " + s2.label() + " with a length of " + s2.length() + " at coordinates (0,0) and color: " + s2.color() + " \n");
		
		System.out.print("-------------------------------\n");
		GuiRegShape t = new Triangle( 3, "triangle1" ) ;
		System.out.print("We have " + t.label() + " with a side of length " + t.length() + " at coordinates (0,0)\n");
		t.move(8,4);
		System.out.print(t.label() + " is now at " + t.location() + "\n");
		t.color( Color.WHITE ) ;
		System.out.print(t.label() + " is now " + t.color() + " in color\n");
		System.out.print(t.label() + " has a area of " + t.area() + "\n");
		if(testEquality(t.area(), (3.0*3.0/2.0))) {
			System.out.print("It passes the Area Equality test\n");
		}
		System.out.print(t.label() + " has a perimeter of " + t.perimeter() + "\n");
		if(testEquality(t.perimeter(), (3.0*3.0))) {
			System.out.print("It passes the Perimeter Equality test\n");
		}
		GuiRegShape t2 = new Triangle( 4, "triangle2", fill ) ;
		System.out.print("We have " + t2.label() + " with a length of " + t2.length() + " at coordinates (0,0) and color: " + t2.color() + " \n");
		
		System.out.print("-------------------------------\n");
		GuiRegShape c = new Circle( 7, "circle1" ) ;
		System.out.print("We have " + c.label() + " with a radius " + c.length() + " at coordinates (0,0)\n");
		c.move(8,4);
		System.out.print(c.label() + " is now at " + c.location() + "\n");
		c.color( Color.WHITE ) ;
		System.out.print(c.label() + " is now " + c.color() + " in color\n");
		System.out.print(c.label() + " has a area of " + c.area() + "\n");
		if(testEquality(c.area(), (3.14*7.0*7.0))) {
			System.out.print("It passes the Area Equality test\n");
		}
		System.out.print(c.label() + " has a perimeter of " + c.perimeter() + "\n");
		if(testEquality(c.perimeter(), (2*3.14*7.0))) {
			System.out.print("It passes the Perimeter Equality test\n");
		}
		GuiRegShape c2 = new Circle( 4, "circle2", fill ) ;
		System.out.print("We have " + c2.label() + " with a radius of " + c2.length() + " at coordinates (0,0) and color: " + c2.color() + " \n");
		
	}
	public static boolean testEquality(double calc, double actual) {
		return Math.abs(calc - actual) < 0.000009 ;
	}
}
