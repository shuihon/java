public class TestSwitchCase {
	public static void main(String[] args) {
		char grade = 'B';
		 
		switch (grade)
		{
		case 'A' :
			System.out.println("excellent");
			break;
		case 'B' :
		case 'C' :
			System.out.println("good");
			break;
		case 'D' :
			System.out.println("fair");
			break;
		default:
			System.out.println("garde not exsiting");
		}
		System.out.println("The garde is" +  grade );
	}
}