public class Hwfactorialpeach{
	public static void main(String [] args) {
		/*猴子吃桃问题，有一篮子桃子，每天吃掉一半，并且多吃一个，
		 * 第十天想吃时，发现只剩一个桃子，问第一天的时候有几个桃子
		 * 已知条件时第十天day10=1个桃子，day9=4个桃子，day9=（day10+1）*2=4个
		 * 发现这是一个倒推的问题，第九天由day10可以求得，以此类推，day1=（day2+1）*2
		 * 这是符合递归的思想，所以要在方法里面调用方法，循环
		 */
		T t1 = new T ();//这是创建一个对象，该对象在不同类里面
		int day = 2;
		int peachNum = t1.peach(day);//调用这个对象的方法
		if(peachNum != -1) {
			System.out.println( "第"+ day + "天时有" + peachNum + "个桃子。");
		}
	}
}
class T {//创建一个类，该类有一个递归方法，计算猴子吃桃问题，
	//必须写在主类外面，这是独立的类
	public int peach( int day ) {
		if( day == 10) {
			return 1;//因为是int类型，必须有返回值
		}else if( day >=1 && day <=9) {
			return (peach(day + 1) +1) *2 ;
		}else {
			System.out.println("天数必须在1～10之间。");
			return -1;//必须给他一个返回值
		}
	}
}