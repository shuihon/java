package polymorphic;

import java.util.LinkedList;

@SuppressWarnings("all")
public class LinkedList_ {
	public static void main(String[] args) {

		LinkedList LinkedList = new LinkedList();
		for (int i = 0; i <= 12; i++) {
			LinkedList.add(i);
		}
		LinkedList.add(100);
		LinkedList.add(200);
		for (Object obj : LinkedList) {
			System.out.println(obj);
		}
		
	}

}