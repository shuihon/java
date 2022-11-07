public class hwStringtoBasic {
	public static void main(String[] args ) {
		byte n1 = 99 ;
		short n2 = 101;
		int n3 = 100 ;
		float f1 = 104;
		double d1 = 105;
		char c1 = 'a';
		boolean b1 = false;
		String s = n1 + "";
		String s1 = n2 + "";
		String n = n3 + "";
		String f = f1 + "";
		String d = d1 + "";
		String b = b1 + "";	
		System.out.println(s + "\t" +  s1 + "\t" + 
		n + "\t" + f + "\t" + d + "\t" + b + "\t");
		String s5 = "-108";
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		boolean num6 = Boolean.parseBoolean("false");
		short num7 = Short.parseShort(s5);
		System.out.println("num1=" + "\t" + num1);
		System.out.println("num2=" + "\t" + num2);
		System.out.println("num3=" + "\t" + num3);
		System.out.println("num4=" + "\t" + num4);
		System.out.println("num5=" + "\t" + num5);
		System.out.println("num6=" + "\t" + num6);
		System.out.println("num7=" + "\t" + num7);
		System.out.println("\t" + s5.charAt(2));
		
	}
}