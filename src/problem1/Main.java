package problem1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read a value. Print out from 1 to the input
		Scanner in=new Scanner(System.in);
	    int counter=1;
	    int counters=in.nextInt();
	    while (counter<=counters) {
	    	System.out.println(counter);
	    	counter++;
	    }
	}

}
