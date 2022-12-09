public class Hwvarparameter{
	public static void main(String [] args) {
		Method M = new Method();//类名  对象名字= new 一个对象，对于Method
		System.out.println(M.Score("rin", 98.7,65.7,94,76.5));
		//方法谁调用就返回给谁，返回出return后面的值
	}
}
class Method{
	/*public String showScore(String name ,double score1 ,double score2 ) {
		double totalScore = score1 + score2;
		System.out.println(name + totalScore);
		return "";
	}
	public void showScore(String name,double score1, double score2, double score3) {
		double totalScore = score1 + score2 + score3;
		System.out.println(name + totalScore);
	}*/
	public String Score (String name ,double...score) {//可变参数在最后
		double res = 0; 
		for (int i = 0; i < score.length; i++) {
			res += score[i];//遍历数组，加等求和
		}//必须有return返回值，而且要注意代码的位置，是在方法体内，别跑去了for循环里面
		return name + "的"+ score.length + "门课的总成绩是" +res + "平均分是" + (res/score.length);
	}
}