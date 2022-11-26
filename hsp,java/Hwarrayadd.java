public class Hwarrayadd {
	public static void main (String [] args) {
		int [] array1 = {1, 2, 3};
		int [] array2 = new int [array1.length + 1];
		for(int i = 0; i < array1.length; i++) {
			array2 [i] = array1 [i];
		}
		array2 [array2.length - 1] = 4;
		array1 = array2 ;
		for(int i = 0; i <array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
		
	}
	
}