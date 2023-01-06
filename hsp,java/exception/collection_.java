package polymorphic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collection_ {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List Dog = new ArrayList();
		Dog.add(new Dog("alice", 18));
		Dog.add(new Dog("jacky", 19));
		Dog.add(new Dog("tomboy", 24));
		for (Object dog : Dog) {
			System.out.println(dog);
		}
		Iterator iterator = Dog.iterator();
		while (iterator.hasNext()) {
			Object dog1 = iterator.next();
			System.out.println("迭代器遍历元素得:\n" + dog1);
		}
	}
}

class Dog {
	private String name;
	private int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String toString() {

		return name + "\t" + age;
	}
}
