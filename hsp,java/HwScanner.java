import java.util.Scanner;
public class HwScanner {
	public static void main () {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("お名前をに入力してください");
		String name = myScanner.next();
		System.out.println("年齢を入力してください");
		int age = myScanner.nextInt();
		System.out.println("給料を入力してください");
		double salary = myScanner.nextDouble();
		System.out.println("お客様の情報は" + "\n名前：" +name 
				+ "\n年齢："+ age
				+ "\n給料：" + salary);
		
	}
}