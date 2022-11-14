import java.util.Scanner;
public class Ifhw {
	public static void main (String [] args ) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入判断年份");
		int year = myScanner.nextInt();
		if ((year % 4 == 0 && year % 100 != 0)
				|| year % 400 == 0) {
			System.out.println("您输入的年份是闰年");
		}else {
			System.out.println("您输入的年份不是闰年");
		}
	}
}