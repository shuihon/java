public class Hwdowhile{
	public static void main(String [] args) {
		int start = 1;
		int i = start;
		int end = 200;
		int sum =0;
		int count = 0;
		do  {
			if(i % 5 == 0 && i % 3 != 0
					) {
				System.out.println("i=" + i);
				count ++ ;
			}
			//count++;
			i++;
			sum += i;
		}while(i <= end);
		System.out.println("count个数是" + count);
		System.out.println("总和是" + sum);
		System.out.println("跳出dowhile循环，此时i=" + i);
	}
} 