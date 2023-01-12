package polymorphic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class HashMap_ {

	public static void main(String[] args) {
		Map hashmap = new HashMap();
		hashmap.put(1, new Emp("alice", 2, 19000));
		hashmap.put(2, new Emp("tom", 8, 14500));
		hashmap.put(3, new Emp("jack", 2, 18000));
		hashmap.put(4, new Emp("jewl", 2, 15000));
		hashmap.put(5, new Emp("Bob", 2, 20000));
		System.out.println("迭代器输出+EntrySet");
		Set entrySet = hashmap.entrySet();
		Iterator iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			Emp emp = (Emp) entry.getValue();
			if (emp.getSal() > 18000) {
				System.out.println(emp);
			}

		}
		System.out.println("增强for循环+keySet");
		Set keySet = hashmap.keySet();
		for (Object obj : keySet) {
			Emp emp = (Emp) hashmap.get(obj);
			if (emp.getSal() > 18000) {
				System.out.println(emp);
			}
		}
	}
}

class Emp {
	private String name;
	private int ID;
	private double sal;

	public Emp(String name, int ID, double sal) {
		this.name = name;
		this.ID = ID;
		this.sal = sal;
	}

	public String toString() {
		return name + "\t" + ID + "\t" + sal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getID() {
		return ID;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getSal() {
		return sal;
	}
}