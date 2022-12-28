package static_;

public class abstract_ {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.caltime();
		BB bb = new BB();
		bb.caltime();
	}
}

abstract class template {
	public abstract void job();

	public void caltime() {
		long start = System.currentTimeMillis();
		job();
		long end = System.currentTimeMillis();
		System.out.println("耗时：" + (end - start));
	}
}

class AA extends template {

	@Override
	public void job() {
		long num = 0;
		for (long i = 1; i <= 80000; i++) {
			num += 1;
		}
		// TODO Auto-generated method stub

	}

}

class BB extends template {
	public void job() {
		long num = 0;
		for (long i = 1; i <= 800000; i++) {
			num += 1;
		}
	}
}