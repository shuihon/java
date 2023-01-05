package polymorphic;

public class userRegister_ {
	public static void main(String[] args) {
		String name = "acky";
		String email = "jacky@gmail.com";
		String psw = "jacky";
		try {
			userRegister(name, psw, email);
			System.out.println("恭喜您注册成功！");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void userRegister(String name, String psw, String email) {
		int nameLength = name.length();
		if (!(name.length() < 5 && name.length() > 1)) {
			throw new RuntimeException("注册失败:\n用户名长度必须为2，3，4位");
		}
		int i = email.indexOf('@');
		int j = email.indexOf('.');
		if (!(j > i && i > 0)) {
			throw new RuntimeException("邮箱格式不正确");
		}
		if (!(psw.length() == 6 && isDigital(psw))) {
			throw new RuntimeException("密码必须全是六位数字组成");
		}
	}

	public static boolean isDigital(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (i < 0 || i > 9) {
				return false;
			}
		}
		return true;
	}
}
