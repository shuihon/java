package polymorphic;

@SuppressWarnings({ "all" })
public class try_catch_ {
	public static void main(String[] args) {
		try {
			if (args.length != 2) {
				throw new ArrayIndexOutOfBoundsException("参数个数不对");
			}
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			double result = cal(a, b);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("参数格式不正确，需要输入整数");
		} catch (ArithmeticException e) {
			System.out.println("分母不能为0");
		}

	}

	public static double cal(int a, int b) {
		return a / b;
	}
}
