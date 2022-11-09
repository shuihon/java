public class hwoperator {
	public static void main(String [] args) {
		int days = 59 ; 
		int weeks = days / 7 ;
		int leftdays = days % 7 ;
		System.out.println(days + "天，离假期还有" + weeks + 
				"个星期，零" + leftdays + "天");
		double c = 234.5 ;
		double d = 5.0/9* (c - 100) ;
		System.out.println("华氏温度"+ c + "\n"
		+ "对应的摄氏温度是" + d );
	}
}