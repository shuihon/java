package extend_;

public  class extends02{
	public static void main(String [] args) {
		PC pc = new PC("APPLE", 16,500,"IBM");
		pc.printinfo();
	}
} 
class Computer{
	private String cpu;
	private int memory;
	private int disk;
	public Computer(String cpu, int memory, int disk ) {
		this.cpu = cpu;
		this.disk = disk;
		this.memory = memory;
	}
	
	public String getdetails() {
		return "cpu=" +cpu + "memory="+ memory + "disk="+ disk;
	}
	public String getcpu() {
		return cpu;
	}
	public void setcpu(String cpu) { 
		 this.cpu=cpu;
	}
	public int getmemmory() {
		return memory;
	}
	public void setmemory(int memory) {
		this.memory=memory;
	}
	public int getdisk() {
		return disk;
	}
	public void setdisk(int disk) {
		this.disk= disk;
	}
}
class PC extends Computer {
    private String brand;
	public PC(String cpu, int memory, int disk, String brand) {
		super(cpu, memory, disk);
		this.brand= brand;
		
		// TODO Auto-generated constructor stub
	}
	public String getbrand() {
		return brand;
		
	}
	public void setbrand(String barnd, String brand) {
		//this.setbrand();
		this.brand = brand;
	}
	public void printinfo() {
		System.out.println(getdetails()+ "brand="+brand);
		System.out.println();
	}
	
}