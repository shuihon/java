package polymorphic;

@SuppressWarnings({ "all" })
public class String_ {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "gray";
		Person p2 = new Person();
		p2.name = "gray";
		System.out.println(p1.name.equals(p2.name));// 字符串常量内容比较
		System.out.println(p1.name == p2.name);// p1和p2的name的地址比较，存放的都是常量池下的gray的地址
		System.out.println(p1 == p2);// p1和p2放的地址，是堆内不同的地址
		System.out.println(p1.name == "gray");// gray就在常量池内可以找到
		String s1 = new String("cardi");
		String s2 = new String("cardi");
		System.out.println(s1 == s2);// s1和s2内存放的地址比较，都是new的新对象，所以放的地址也是不同的
	}
}

class Person {
	public String name;
}