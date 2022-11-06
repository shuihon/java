public class javahomeworksec {
	public static void main(String[] args) {
		System.out.println("java执行流程："
				+ "\nJava执行过程中分为编译过程和运行过程。"
				+ "\n编译过程：将源文件编译成class字节码文件"
				+ "\n运行过程：将字节码文件在控制台运行"
				+ "\n本质是将对应的字节码文件装载在JVM虚拟机上运行。"
				+ "\nJava初学者注意事项："
				+ "\n运行过程执行的是class文件，如果对源文件修改后没有重新编译，"
				+ "则呈现的结果依旧不会改变。"
				+ "\n一个源文件只能有一个public类，其他类个数不限，有几个类就会生成几个class文件。"
				+ "\nmain方法可以写在非public类中，这样入口方法就是非public的main方法。");
	}
}