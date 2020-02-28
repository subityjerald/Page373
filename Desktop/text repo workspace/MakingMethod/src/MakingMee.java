
import java.util.Random;
public class MakingMee {
public static void main (String args[]) {
	
	Random myRandom=new Random();
	String lastname = null;
	int id = 0;
	double balance = 0;
	for(int i=0;i<3;i++) {
		id=myRandom.nextInt(10);
		System.out.print("what is the id number");
		System.out.println(id);
		balance=myRandom.nextInt(100);
		System.out.print("what is the balance amount");
		System.out.println(balance);
		lastname=""+(char)(myRandom.nextInt(26)+'A')+(char)(myRandom.nextInt(26)+'a')
				+(char)(myRandom.nextInt(26)+'a');
		System.out.print("what is the last name of the customer");
		System.out.println(lastname);
	}
	
}
}
