public class Hwarry2 {
	public static void main(String [] args) {
		int arry [] = new int [10];
		for(int i = 0; i < arry.length; i++) {
			arry[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("arry随机生成的元素" );
		for(int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + "\t");
		}
		System.out.println( "\n数组倒序：" );
		for(int i = arry.length-1; i >= 0; i--) {
			
			System.out.print( arry[i] + "\t");
		}
		double sum = arry[0];
		int max = arry[0];
		int maxIdex = 0;
		for(int i = 1; i < arry.length-1; i++) {
			sum += arry[i];
			if(max < arry[i]) {
				max = arry[i];
				maxIdex = i;
			}
		}
		System.out.println("\n最大值：\t" + max + "\t最大值下标:\t" + maxIdex);
		System.out.println("平均值：" + sum/arry.length);
		int findNum = 9;
		int index = -1;
		for(int i = 0; i < arry.length; i++) {
			if(findNum == arry[i]) {
				System.out.println("找到findNum：" + findNum);
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("没有找到findNum");
		}
		
	}
	
}