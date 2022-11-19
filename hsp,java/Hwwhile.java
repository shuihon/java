public class Hwwhile{
	public static void main(String [] args) {
		int start = 4;
		int num = start;
		int end = 200;
		int t = 2;
		int count = 0;
		int sum = 0;
		while (num <= end) {
			if(num % t == 0) {	
			System.out.println(num); 
			}
			num ++;	
			count ++;
			sum += num;
		}
		System.out.println("符合条件数的个数一共是："
				+  + count+"个\n"+ "符合条件数的总和是：" + sum);
	}
}