package polymorphic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ {
	public static void main(String[] args) {
		List list = new ArrayList();
		for (int i = 0; i < 12; i++) {
			list.add("hello" + i);

		}
		System.out.print(list);
		list.add(1, "hspedu");
		System.out.println("\n插入元素" + list);// 第二个位置插入hspedu
		System.out.println(list.get(4));// 获取第五个元素并输出来了
		// System.out.println("\n获取第五个元素" + list);
		System.out.println(list.remove(5));// 删除第六个元素，并把塔输出来了
		System.out.println("\n删除第六个元素后的结果" + list);
		System.out.println(list.set(6, "lgf"));//设置第七个元素为lgf
		System.out.println("修改第七个元素后的结果" + list);
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			Object obj = iterator.next();
			System.out.println("迭代器遍历集合结果："+obj);
		}

	}
}