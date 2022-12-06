public class Hwparameter{
	public static void main(String [] args) {
		int [] arry = {10,98,100};
		B a = new B();//引用不同类的方法，要先创建该类的对象
		a.conduct(arry);//名称.方法名（参数）
		for(int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + "\t");	
		}
		System.out.println();//main栈下的数组内的值也被改变，
		//虽然是在conduct栈内做的改变，
		//但由于conduct做修改时是对指向的地址内的数值进行改变
		//main栈和conduct栈指向的是同一个地址，所以数值都改变了
	}
}
class B {//这个类要写在最外面，不同类的情况，与Hwparameter不同类
	public void conduct (int [] arry) {//B类下的一个有关与引用数据类型的方法
		arry [0] = 233;//改变了数组内的一个数值
		for(int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + "\t");
			
		}
		System.out.println();
	}
}