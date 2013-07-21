public class prob3 {
	public static void main(String[] Args) {
		if ( Args.length < 1 ) {
			System.out.print( "ERROR: Please give me a year!\n" );
			System.exit(0);
		}
		int year = Integer.parseInt(Args[0]);
		if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			System.out.print("leap year!\n");
		}
		else {
			System.out.print("not a leap year!\n");
		}
	}
}

