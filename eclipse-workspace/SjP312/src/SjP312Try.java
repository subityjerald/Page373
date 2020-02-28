import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class SjP312Try {
	public static void main (String args[])throws FileNotFoundException {
		Scanner diskScanner=new Scanner(new File("occupancy"));
		System.out.println("room\tguests");
		for(int room=0;room<10;room++) {
			System.out.print(room);
			System.out.print("\t");
			System.out.println(diskScanner.nextInt());
			
		}
		diskScanner.close();
	}

}
