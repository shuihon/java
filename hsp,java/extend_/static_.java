package static_;

public class static_ {
	public static void main(String[] args) {
		students.student("smith", 40000);// 静态方法只能调用同为是静态成员的属性和方法
		students.student("mary", 80000);// 静态属性在类加载的时候就生成，所以没有创建实例对象
		// 也可以直接通过类名来调用
		students.gettotalfee();//静态main方法下调用普通成员属性和方法时，必须先在方法体内创建实例对象
		//通过实例对象名.方法名（属性）来完成普通成员的调用
		//main方法是java虚拟机调用的，main方法的参数生成是在执行程序时，传入参数的时候生成的
		// System.out.println(students.totalfee);
	}

	class students {
		public static String name;// 这是静态属性
		public static double totalfee = 0;

		public static void student(String name, double fee) {// 这是静态方法
			students.name = name;// 静态方法体内不能使用this，super等关键字
			totalfee += fee;// 静态方法体下只能调用静态属性，静态方法，不能调用普通成员（普通方法，普通属性）
		}

		public static void gettotalfee() {
			System.out.println("totalfee:\t" + students.totalfee);
		}
	}
}