import java.text.NumberFormat;
import static java.lang.System.out;
public class Page373 {
String lastname;
int id;
double amount;
void display() {
	NumberFormat Currency=NumberFormat.getCurrencyInstance();
	out.print("what is the customer lastname");
	out.println(lastname);
	out.print("what is the id number");
	out.println(id);
	out.print("what is the amount");
	out.println(Currency.format(amount));
}
}
