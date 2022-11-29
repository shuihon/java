public class Hwyanghui{
	public static void main(String [] args) {
		//创建一个十行的杨辉三角数组，所以该二维数组有十个一位数组
		int [][] yanghui = new int[10][];
		//但根据杨辉三角但特点，每个一维数组内但元素个数不同
		for(int i = 0; i < yanghui.length; i++) {
		//遍历二维数组内的每一个一维数组，同时要给每一个一维数组开辟new个空间
			yanghui[i] = new int[i + 1];
		//行数对应了数组内的元素个数
			for(int j = 0; j<yanghui[i].length; j++) {
		//开始给每个一维数组遍历赋值
		//发现首尾都是1
		//其他项的值等于前一行同列值和前一行前一列值的总和
				if(j == 0 || j == yanghui[i].length-1) {
					yanghui[i][j] = 1 ;
				}else {
					yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j];
				}
		//这表示输出当行的所有元素，写在一维数组的for循环内，不换行
				System.out.print(yanghui[i][j] + "\t");
			
			}
		//这表示显示所有一维数组的值，写在二维数组的for循环内，
		//并且每个一维数组输出后换行
			System.out.println();
		}
	}
}