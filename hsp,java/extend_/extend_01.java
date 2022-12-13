package extend_;

public class extend_01 {
	public static void main(String [] args) {
		extend_.pupil pupil = new pupil();
		pupil.name = "Alice";
		pupil.age = 23;
		pupil.testing();
		pupil.setScore(98.5);
		pupil.showIfo();
		System.out.println("========");
		extend_.graduate graduate = new graduate();
		graduate.age = 22;
		graduate.name = "jacky";
		graduate.testing();
		graduate.setScore(88.9);
		graduate.showIfo();
	}
}