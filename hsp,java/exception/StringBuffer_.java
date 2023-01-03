package polymorphic;

import java.util.Scanner;

public class StringBuffer_ {
	public static void main(String[] args) {
		// String money = "1234564.59";
		Scanner myScanner = new Scanner(System.in);
		String money = myScanner.next();
		StringBuffer Money = new StringBuffer(money);
//		int i = Money.indexOf(".");
//		Money = Money.insert(i - 3, ",");
		for (int i = Money.indexOf(".") - 3; i > 0; i -= 3) {
			Money = Money.insert(i, ",");
		}
		System.out.println(Money);

	}
}
