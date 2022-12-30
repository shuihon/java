package polymorphic;

public class enumeration_ {
	public static void main(String[] args) {
		Week[] values = Week.values();// values得到的是一个数组
		for (Week Weekdes : values) {// 增强for循环，把values下的所有实例依次投给weekdes这个对象
			System.out.println(Weekdes);
		}
	}
}

enum Week {
	// 定义枚举对象
	MONDAY("星期一"), TUESDAT("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FIRDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");

	private String des;

//	public String getdes() {
//		return this.des = des;
//	}

	private Week(String des) {// 私有化构造器
		this.des = des;
		// System.out.println(des);
	}

	public String toString() {
		// return name();//返回常量名称就是MONDAY
		return des;

	}
}