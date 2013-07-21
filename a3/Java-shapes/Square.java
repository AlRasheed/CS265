import java.awt.Point ;
import java.awt.Color ;

public class Square extends GuiRegShape {
	/**
	   Constructor
	   Calls super and initilizes the length and the label of the RegShape

	   @param length the length of the side
	   @param label  the name of the shape
	*/
	public Square( double length, String label) {
		super(length, label);
	}
	/**
	   Constructor
	   Calls super and initilizes the length and the label of the RegShape

	   @param length the length of the side
	   @param label  the name of the shape
	   @param color  the color of the shape
	*/
	
	public Square( double length, String label, Color color) {
		super(length, label, color);
	}
        /**
           Computes and returns the area of the shape

	   @return the area of the shape
	*/

	public double area() {
		return (_len*_len);
	}
        /**
           Computes and returns the perimeter of the shape

	   @return the perimeter of the shape
	*/

	public double perimeter() {
		return (4*_len);
	}
}
