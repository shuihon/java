package static_;

public class final_ {
	public static void main(String[] args) {
		Circle area = new Circle();
		System.out.println(area.area(1));
	}
}

class Circle {
	private double radius;
	private final double PI;// =3.1415926;可以直接给final修饰的属性赋值

	public double area(double radius) {
		return PI * radius * radius;
	}

//	{可以在代码块中给final修饰的属性赋值
//		PI=3.14;
//	}
	public Circle() {// 可以在构造器中给final修饰的属性赋值
		PI = 3.14;
	}
}