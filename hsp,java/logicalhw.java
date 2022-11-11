public class logicalhw {
	public static void main (String [] args ) {
		String logicor = "|" ;
		String logicand = "&";
		String scircuitand = "&&";
		String scircuitor = "||";
		System.out.println(scircuitand = "短路与,结果为真的条件是，1 2条件都为真时。"
				+ "\n假设1为假，2则不判断，不执行,且最终结果为假"
				+ "\n假设1为真，2仍然要判断执行，若2真，整个结果为真"
				+ "\n若2假，"
				+ "则整个结果为假");
		System.out.println(logicand = "逻辑与，结果为真的条件，1 2条件都为真时。"
				+ "\n假设1为假，最终结果为假，但2仍要执行判断"
				+ "\n假设1为真，2继续执行判断。"
				+ "\n2为真时，整个输出结果为真，2为假是，整个输出结果为假。");
		System.out.println(scircuitor = "短路或，结果为真但条件是任意一个为真即可。"
				+ "假设1为真，2不判断，不执行，结果为真"
				+ "假设1为假，2判断执行，若真，结果真；若假，结果假");
		
		System.out.println(logicor = "短路与，结果为真的条件是，1 2条件同时为真。"
				+ "假设1为真，2要执行判断是否真"
				+ "假设1为假，2仍要执行判断是否为真" );
		
	}
}