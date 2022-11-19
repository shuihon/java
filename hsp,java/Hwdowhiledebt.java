import java.util.Scanner;
public class Hwdowhiledebt{
	public static void main(String [] args) {
		Scanner myScanner = new Scanner(System.in) ;
		char a = 'a';
		do {
			System.out.println("you will be fined");
			System.out.println("return？y/n");
			a = myScanner.next().charAt(0);
			System.out.println("his answer is " + a);
		}while(a != 'y' );
		System.out.println("he finally returned ");
	}
}