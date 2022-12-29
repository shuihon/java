package polymorphic;

public class inter_ {
	public static void main(String[] args) {
		cellphone cellphone = new cellphone();
		cellphone.alarmclock(new Bell() {
			public void ring() {
				System.out.println("小伙伴上课了");
			}
		});
		cellphone.alarmclock(new Bell() {
			public void ring() {
				System.out.println("懒猪起床了");
			}
		});
//		ringing(new Bell() {
//			public void ring() {
//				System.out.println("懒猪起床了");
//			}
//		});
	}
//	public static void ringing(Bell bell) {
//		bell.ring();
//	}
}

interface Bell {
	void ring();
}
class cellphone {
	public void alarmclock(Bell bell) {
		bell.ring();
	}
}