public class Hwarray{
	public static void main (String [] args) {
		double [] array = new double[3];
		//声名一个数组，内含double类型的数据；
		//new创建了数组，里面有三个存储空间
		double [] array1 = new double [array.length];
		//创造一个新的数组空间，其储存空间和array一样
		//先创造后存储，这是数组的动态初始化
		array [0] = 1.9;
		array [1] = 2.01;
		array [2] = 5;
		for(int i = 0; i < array.length; i++) {
			array1[i] = array [i];
			//循环，遍历整个数组，使其每一个值拷贝至另一个数组空间内
		}
		array1[0] = 100;//改变数组2的值
		for(int i= 0; i < array.length; i++) {
			System.out.println(array[i]);
		}//遍历输出数组1的值
			for(int i= 0; i < array.length; i++) {
		System.out.println(array1[i]);
		}//遍历输出数组2的值，发现数组2的值与1的不同
	}
}