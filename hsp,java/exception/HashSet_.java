package polymorphic;

import java.util.HashSet;

@SuppressWarnings("all")
public class HashSet_ {
	public static void main(String[] args) {

		HashSet hashset = new HashSet();
		hashset.add("lucy");
		hashset.add("lucy");
		hashset.add(new Cat("tom", 9));
		hashset.add(new Cat("tom", 12));
		System.out.println("hashset=" + hashset);
	}
}

class Cat {

	private String name;
	private int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int setAge() {
		return age;
	}

	public void getAge() {
		this.age = age;
	}

	public String setName() {
		return name;
	}

	public void getName() {
		this.name = name;
	}

	public String toString() {
		return name + age;
	}

}