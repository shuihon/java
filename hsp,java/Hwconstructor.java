public class Hwconstructor{
	public static void main(String [] args) {
		Person A = new Person();//无参构造器的调用写法
		System.out.println("第一个人的信息:"+ A.age + "\t" + A.name);
		Person B = new Person( "Alice", 21);//第二个构造器调用的写法
		System.out.println("第二个人的信息:" + B.age + "\t" + B.name);
	}
}
class Person{
	int age;//这是全局变量，也叫属性
	String name;
	public Person() {//这是构造器，无形式参数构造器
		age = 18;//规定这个构造器下的人都是一个年纪
	}//构造器没有返回值，名字必须和类名一样
	public Person(String name1, int age1 ) {//这是有形式参数的构造器，
		age = age1;//俩个构造器就是构造器重载
		name = name1;//这是构造器的初始化，对于对象的属性赋值
	}
}