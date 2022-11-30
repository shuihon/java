public class Hwarry1{
	public static void main(String [] args) {
		int [] arry = {10, 12, 45, 90};
		int insertNum = 23;
		int index = -1;
		for(int i = 0; i < arry.length; i++) {
			if(insertNum < arry[i]) {
				index = i;
				break;
			}/*else {
				index = arry.length;
			}*/
		}
		if (index == -1) {
			index = arry.length;
		}
		System.out.println("index:" + index);
		int [] newarry = new int [arry.length + 1];
		for(int i = 0, j = 0; i < newarry.length; i++) {
			if(i != index) {
				newarry[i] = arry[j];
				j++;
			}else {
				newarry[i] = insertNum;
			}
		}
		arry = newarry;
		for(int i = 0; i < arry.length; i++) {
		System.out.print( arry[i] + "\t");
		}
	} 
}
