public class Puppy {
	int puppyAge;
	public Puppy(String name) {
		System.out.println("犬の名前は"+ name);
		
	}
	public void setAge( int age) {
		puppyAge = age;
	}
	
	public int getAge() {
		System.out.println("犬の年齢は"+ puppyAge);
		return puppyAge;
		}
	public static void main (String[] args) {
		Puppy myPuppy = new Puppy("tommy");
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("変数の値は"+ myPuppy.puppyAge);
	}
}