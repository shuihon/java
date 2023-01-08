package polymorphic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings("all")
public class set_ {
	public static void main(String[] args) {

		Set set = new HashSet();
		set.add("john");
		set.add("alice");
		set.add("jewl");
		set.add("tomboy");
		set.add("tomboy");
		set.add("freaky girl");
		set.add(null);
		set.add(null);
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}
		for (Object obj : set) {
			System.out.println("obj="+obj);
		}
	}
}