package polymorphic;

import java.util.LinkedHashSet;
import java.util.Set;

@SuppressWarnings("all")
public class LinkedHashSet_ {
	public static void main(String[] args) {
		Set linkedhashset = new LinkedHashSet();
		linkedhashset.add(new String("AA"));
		linkedhashset.add(new String("AA"));
		linkedhashset.add(234);
		linkedhashset.add(234);
		linkedhashset.add(new Customer("alice", 34));
		linkedhashset.add("hsp");
		System.out.println(linkedhashset);
	}
}

@SuppressWarnings("all")
class Customer {

	private String name;
	private int age;

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int setAge(int age) {
		return age;
	}

	public int getAge(int age) {
		return this.age = age;
	}

	public String setName(String name) {
		return name;
	}

	public String getName(String name) {
		return this.name = name;
	}

	public String toString() {
		return name + age;

	}
}
