public class Hwparameter{
	public static void main(String [] args) {
		int [] arry = {10,98,100};
		B a = new B();
		a.conduct(arry);
		for(int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + "\t");	
		}
		System.out.println();
	}
}
class B {
	public void conduct (int [] arry) {
		arry [0] = 233;
		for(int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + "\t");
			
		}
		System.out.println();
	}
}