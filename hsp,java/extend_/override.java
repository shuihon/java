package extend_;

public class override {
	public static void main(String[] args) {
		person jack = new person("jack", 18);
		System.out.println(jack.say());
		student alice = new student("alice", 18, 1342, 89.5);
		System.out.println(alice.say());
	}
}

class person {
	private int age;
	private String name;

	public person(String name, int age) {
		this.age = age;
		this.name = name;
	}// 构造器的写法，如上格式

	public String say() {
		return "\tname " + name + "\tage " + age;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

}

class student extends person {// 直接这样写会报错，因为person已经没有默认构造器了，所以会报错
	private int ID;
	private double scores;

	public student(String name, int age, int ID, double scores) {// 所以要再写一个构造器
		super(name, age);// 这是调用父类的构造器
		this.ID = ID;
		this.scores = scores;
		// TODO Auto-generated constructor stub
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public double getscores() {
		return scores;
	}

	public void setdouble(double scores) {
		this.scores = scores;
	}

	public String say() {// 在子类创建一个和父类一样的方法，实现方法覆盖
		return super.say() + "\tID " + ID + "\tscores " + scores;// 调用父类的say方法
		// 这是一个方法的覆盖，先输出父类的信息，后面是我子类特有的信息
//		this.ID=ID;
//		this.scores=scores;

	}
}