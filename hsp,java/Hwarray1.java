public class Hwarray1{
	public static void main(String [] args) {
		double [] hens = {10.99, 9.03, 8.4, 9.4, 8.019};
		double totalweight = 0;
		for(int i  = 0 ; i < hens.length ; i ++) {
			totalweight += hens[i];
		}
		System.out.println("总体重：" +totalweight +"\t"+
				"平均体重:" + totalweight/hens.length);
	}
}