import java.util.Scanner;
public class Hwifelse {
	public static void main(String [] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = myScanner.nextInt();
		if (month >= 4 && month <= 10 ) {
			System.out.println("请输入年龄");
			int age = myScanner.nextInt();
			if (age >= 18 && age <= 60) {
				System.out.println("60");
			}else if (age > 60) {
				System.out.println("1/3");
			
		    }else if (age < 18) {
		    	System.out.println("半价");
		    }	
		}else {
			System.out.println("成人：40\n其他：20");
		}
		
	}
}