import java.util.Random;
public class NewEnclosing {
	public static void main (String args[]) {
Random myRandom=new Random();
Page373 anAccount;
for(int i=0;i<3;i++) {
	anAccount=new Page373();
	anAccount.lastname=""+(char)(myRandom.nextInt(26)+'A')
			+(char)(myRandom.nextInt(26)+'a')+(char)(myRandom.nextInt(26)+'a');
	anAccount.id=myRandom.nextInt(100);
	anAccount.amount=myRandom.nextInt(1000);
	anAccount.display();
}
}
}