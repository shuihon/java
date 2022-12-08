public class HWhanoiTower {
	public static void main (String [] args) {
		S moving = new S();
		moving.Tower(3,'A','B','C');
	}/*汉诺塔问题，我要把起初所有放在a塔到盘子最终全部放在c盘，
	规则：每次只能移动一个盘
	且移动后下面必须是比上面到盘子大，才可以移动成功
	假设只有一个盘子，那直接就是把a移动到c；
	假设俩个盘子，就是把小盘先移动到b塔，再把大盘移动到c塔，最后把小盘从b塔移动到c塔
	不管多少盘子，把最底盘看作一个整体，底盘以上到所有盘子看作一个整体
	*/
}
class S {
	public void Tower (int i, char a, char b, char c) {
		if( i == 1) {
			System.out.println(a+ " "+ "move to"+ " " + c);
		}else {
			Tower(i-1, a, c, b);
			System.out.println(a + " " +"move to" + " " + c);
			Tower(i-1 , b, a, c);
		}
	}
} 