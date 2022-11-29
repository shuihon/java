public class Hwtwodimension{
	public static void main(String []args) {
		//定义一个二维数组 int arry[][]= new int[a][b];
		//也可以写成这样形式声明二维数组：int[]arry[]=;int arry [][]=;
		//a表示其中行数，b表示每行有多少个元素；
		//此时创建时a，b可以不相等，b也可以空格，表示稍后创建空间
		int arry[][]= new int [19][];
		//arry.length表示有多少行（多少个一维数组）
		for(int i = 0;i < arry.length; i++ ) {
			//遍历二维数组内的每一行，就是把每一行给揪出来
			//此时必须要给每行创建空间，就用new，即有多少个元素在内
			arry[i] = new int [i + 1];
			for(int j = 0; j < arry[i].length; j++) {
				arry[i][j] = i + 1 ;
				//此时已经细化到每一行每一列对应的值，相当于坐标，一维数组内数值的位置
				System.out.print(arry[i][j] + "\t");
				//输出每一个值，在一行，不换行
			}//不同一维数组的值换行
			System.out.println();
		}
	}
}