public class prob1 {
	public static void main(String[] Args) {
		if ( Args.length < 1 ) {
			System.out.print( "ERROR: Please give me something to print!\n" );
			System.exit(0);
		}
		for(int i=0; i <100; i++) {
			System.out.print( Args[0] + " ");
		}
		System.out.print( "\n" );
	}
}

