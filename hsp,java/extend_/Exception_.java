
package polymorphic;

import java.util.Date;

@SuppressWarnings({ "all" }) // 忽略警告的注解
public class Exception_ {
	public static void main(String[] args) {
		Object obj = new Date();
		Exception_ person;
		try {
			person = (Exception_) obj;// 这是运行类型异常下的，类型转化异常，ClassCastException
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("异常信息：" + e.getMessage());
		} finally {
//释放资源的代码块区域
		}

	}
}
