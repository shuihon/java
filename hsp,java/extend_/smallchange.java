package polymorphic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class smallchange {
	public static void main(String[] args) {
		System.out.println("\n\t\t零钱通项目\t\t");
		boolean loop = true;// loop用来控制显示菜单的
		Scanner scanner = new Scanner(System.in);
		String key = "";
		String details = "~~~~\t零钱通明细";
		double money = 0;
		double balance = 0;
		Date date = null;// java.util.date包下的，表示日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");// 用于日期格式化的
		String note = "";
		do {
			System.out.println("\n\t=======零钱通菜单========");
			System.out.println("\t1\t零钱通明细\n");
			System.out.println("\t2\t收     益");
			System.out.println("\t3\t消     费");
			System.out.println("\t4\t退     出");
			System.out.println("请选择1～4:");
			key = scanner.next();
			switch (key) {
			case "1":
				// System.out.println(零钱通明细);
				System.out.println(details);
				break;
			case "2":
				// System.out.println("2收益");
				System.out.println("收益入账金额:\t");
				money = scanner.nextDouble();// money的值范围应该校验
				if (money <= 0) {// 找不正确的角度
					System.out.println("收益入账金额要大于0⃣️");
					break;

				}
				balance += money;
				date = new Date();// 获取当前的日期
				// System.out.println(sdf.format(date));
				// 拼接收益入账信息到details
				details += "\n\t收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + "余额\t" + balance;
				break;
			case "3":
				// System.out.println("3消费");
				System.out.println("消费金额:\t");
				money = scanner.nextDouble();
				if (money <= 0 || money > balance) {
					System.out.println("消费金额应该在0～" + balance + "之间");
					break;
				}
				System.out.println("消费说明:\t");
				note = scanner.next();
				balance -= money;
				date = new Date();
				details += "\n\t" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + "余额\t" + balance;
				break;
			case "4":
				//System.out.println("4退出");
				String choice = "";
				while (true) {// 这是无限循环,要求用户必须输入y或者n
					System.out.print("你确定要退出吗？y/n");
					choice = scanner.next();
					if ("y".equals(choice) || "n".equals(choice)) {
						break;// 只有输入y或者n循环才会跳出，否则一直循环
					}

				}
				if (choice.equals("y")) {// 此处对于接收的y或者n，由此来执行相应代码4
					loop = false;
				} // else if(choice.equals("n")){
                 //	loop=true;
				break;
			default:
				System.out.println("选择有误，请重新选择");
			}
		} while (loop);

	}
}