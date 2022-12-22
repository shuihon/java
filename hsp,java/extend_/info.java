/**
 * 
 */
/**
 * @author gaofenglin
 *
 */
package polymorphic;

public class info {
	public static void main(String[] args) {
		workers alice = new workers("alice", 1000);
		managers jacky = new managers("jacky", 30000, 1000000);
		info person = new info();
		person.shownanualsal(alice);
		person.shownanualsal(jacky);
		person.testwork(alice);
		person.testwork(jacky);

	}

	public void shownanualsal(Empolyee e) {
		System.out.println(e.getnanual());
	}

	public void testwork(Empolyee e) {
		if (e instanceof workers) {// 类型判断
			((workers) e).work();// 向下转型
		} else if (e instanceof managers) {
			((managers) e).manage();
		} else {
			return;
		}
	}
}

class Empolyee {// 整个基本流程，先写属性，再写构造器，再写方法
	private String name;
	private double salary;

	public Empolyee(String name, double salary) {
		this.name = name;
		this.setSalary(salary);
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getnanual() {
		//System.out.println(name + "\tnanual salary:" + salary*12);
		return salary*12;
		
	}
}

class workers extends Empolyee {

	public workers(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the scores
	 */
	public double getScores() {
		return scores;
	}

	/**
	 * @param scores the scores to set
	 */
	public void setScores(double scores) {
		this.scores = scores;
	}

	private double scores;

	public double getnanual() {
		return super.getnanual();

	}

	public String work() {
		System.out.println(getname() + "\tis working");
		return null;
	}

}

class managers extends Empolyee {
	public managers(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	private double bonus;

	public double getbonus() {
		return bonus;
	}

	public void setbonus(double bonus) {
		this.bonus = bonus;
	}

	public void manage() {

		System.out.println(getname() + "\tis managing");
	}

	public double getnanual() {
		return super.getnanual()+bonus;
	}
}
