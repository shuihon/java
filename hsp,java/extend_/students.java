package extend_;

public class students {
	public String name;
	private double score;
	public int age;

	public void setScore(double score) {
		// this.setScore(score);
		this.score = score;
	}

	public void showIfo() {
		System.out.println("name\t" + name + "\tage\t" + age + "\tscore\t" + score);
	}

}