import java.util.*;

public class prob4 {
	public static void main(String[] Args) {
		if ( Args.length < 1 ) {
			System.out.print( "ERROR: Please give me an option!\n" );
			System.exit(0);
		}
		Date epoch = new Date();
		long time = epoch.getTime();
		Date date = new Date();
		switch( Integer.parseInt(Args[0]) ) {
			case 0: System.out.print("milliseconds since January 1, 1970: " + time + " \n");
				break;
			case 1: System.out.print("seconds since January 1, 1970: " + time/1000 + " \n");
				break;
			case 2: System.out.print("days since January 1, 1970: " + time/(1000*60*60*24) + " \n");
				break;
			case 3: System.out.print("It is currently " + date + "\n");
		}

	}
}

