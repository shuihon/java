public class Hwthis{
	public static void main(String [] args) {
		Hito p1 = new Hito("Alice" , 18);//创建了俩个对象，并利用构造器完成了属性初始化
		Hito p2 = new Hito("Jacky", 21);
		System.out.println("俩人是否同名同岁\t" + p1.compareto(p2));
	}//调用compareto方法比较俩人是否同名同岁
}
class Hito{
	String name;//属性，也是这个类的全局变量
	int age;
	public Hito (String name, int age) {//一个构造器
		this.name = name;//this就是特指该类的属性，对应的name
		this.age = age;//该类下属性对应的age
	}
	public boolean compareto( Hito p) {//这是一个方法
		/*if(this.name.equals(p.name) && this.age == p.age) {
			return true;//如果名字相同并且年龄相同就返回return true
		}else {//可以简化成：return this.name.equals(p.name) && this.age == p.age ;
			return false;
		}*/
		return this.name.equals(p.name) && this.age == p.age;
	}
}