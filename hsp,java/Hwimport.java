import java.util.Arrays;

public class Hwimport {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 88, -1, 57 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
