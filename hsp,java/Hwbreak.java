import java.util.Scanner;
public class Hwbreak{
	public static void main(String [] args ) {
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String password = "";
		int chance = 3;
		for(int i = 1 ; i <=3 ; i++) {
			System.out.println("请输入用户名");
			name = myScanner.next();
			System.out.println("请输入密码");
			password = myScanner.next();
			if("lxh".equals(name) && "2001".equals(password)) {
				System.out.println("登录成功");
				break;
				
			}
		}
		chance--;
		System.out.println("还剩" + chance + "登陆机会");
	}
}