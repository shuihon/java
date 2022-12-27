package static_;

public class interface_ {
	public static void main(String[] args) {
		iphone iphone = new iphone();
		camera camera = new camera();
		computer computer = new computer();
		computer.working(iphone);
		computer.working(camera);
	}
}

interface usb {
	public void start();

	public void end();
}

class iphone implements usb {
	public void start() {
		System.out.println("手机开始工作");
	}

	public void end() {
		System.out.println("手机停止工作");
	}

}

class camera implements usb {
	public void start() {
		System.out.println("相机开始工作");
	}

	public void end() {
		System.out.println("相机停止工作");
	}

}

class computer {
	public void working(usb usb) {
		usb.start();
		usb.end();
	}
}