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
		hashmap.put(1, new Emp("tom", 8, 14500));
		hashmap.put(1, new Emp("jack", 2, 18000));
		hashmap.put(1, new Emp("jewl", 2, 15000));
		hashmap.put(1, new Emp("Bob", 2, 20000));
		Set entrySet = hashmap.entrySet();
		Iterator iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			Emp emp = (Emp) entry.getValue();
			if (emp> 18000) {

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
		return name + ID + sal;
	}

	public String setName() {
		return name;
	}

	public void getName(String name) {
		this.name = name;
	}

	public void setID(){
		this.ID=ID;
	}

	public int getID( int ID){
		return ID;
	}

	public double setSal(double sal) {
		return sal;
	}

	public void getSal(double sal) {
		this.sal = sal;
	}
}