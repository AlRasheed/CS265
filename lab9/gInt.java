import java.io.*;

public class gInt {
	int a=0;
	int b=0;
	
	public gInt(int r){
		a = r;
	}
	public gInt(int r, int i){
		a = r;
		b = i;
	}
	public int real(){
		return a;
	}
	public int imag(){
		return b;
	}
	public gInt add(gInt rhs) {
		gInt added = new gInt((a + rhs.real()),(b + rhs.imag()));
		return added; 
	}
	public gInt multiply(gInt rhs) {
		gInt multiplied = new gInt((a*rhs.real())-(b*rhs.imag()),(a*rhs.imag())+(b*rhs.real()));
		return multiplied; 
	}
	public float norm() {
		return ((a*a)+(b*b));
	}
	public static void main(String arg[]) {
		gInt first = new gInt(2,3);
		gInt second = new gInt(4,5);
		gInt added = null;
		added = first.add(second);
		System.out.print("" + added.real() + " + " + added.imag() + "i\n");
		gInt mul = null;
		mul = first.multiply(second);
		System.out.print("" + mul.real() + " + " + mul.imag() + "i\n");
		gInt normed = new gInt(3,1);
		System.out.print("norm of 3+1i is " + normed.norm() + "\n");
	}
}

