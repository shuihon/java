package static_;

public class codeblock {
	public static void main(String[] args) {
		test a = new test();
	}
}

class sample {
	sample(String s) {
		System.out.println(s);
	}

	sample() {
		System.out.println("sample默认方法构造器被调用");
	}

}

class test {
	sample sam1 = new sample("sam1成员初始化");
	static sample sam = new sample("静态成员sam初始化");
	static {
		System.out.println("static 代码块被执行");
		if (sam == null) {
			System.out.println("sam is null");
		}
//	test(){
//		System.out.println("test 默认构造器被调用");
//		}
	}
}