import java.util.Scanner;
public class Hwswitch2 {
	public static void main (String [] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入您的成绩");
		double score = myScanner.nextDouble();
		if (score >= 0 && score <=100) {
		     switch ((int)score/60) {
		    case 1 :
		    	System.out.println("合格");
		    	break;
		    case 0 :
		        System.out.println("不合格");
		        break;
		        //default :
		        	//System.out.println("");
		      }      
		}else {
			System.out.println("您输入的成绩有误，请重新输入");
		}
	}
}

	
