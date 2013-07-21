public class prob2 {
	public static void main( String[] Arg ) {
		if ( Arg.length < 1 ) {
			System.out.print("ERROR: Please give me a number to process!\n");
			System.exit(0);
		}
		int num = Integer.parseInt( Arg[0] );
		if (num % 2 == 0) {
			System.out.print("even\n");
		}
		else {
			System.out.print("odd\n");
		}
	}
}


