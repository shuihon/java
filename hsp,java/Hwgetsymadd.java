public class Hwgetsymadd {
	public static void main(String [] args) {//这是主方法入口，也是程序的入口
		
		class AA {//创建一个类，为的是创建一个方法，同时输出多个值
			public int [] getsummadd(int n1, int n2) {//利用数组达到多个值输出的目的
				int[] resarry = new int[2];//在方法体内写方法
				resarry[0] = n1 + n2;//创建一个可以输出2个值的数组，每一个值的计算方式如上
				resarry[1] = n1 - n2;
				return resarry;//将数组的值返回
			}
		}
		AA a = new AA ();//调用AA类的成员方法，先建立一个属于AA类下的对象，a
		int[] res = a.getsummadd(2,99);//开始调用gets名称的方法，将值赋给res数组
		System.out.println("和：" + res[0]);//利用下标输出相应需要的数值
		System.out.println("差：" + res[1]);
	}
}