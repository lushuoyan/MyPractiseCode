package ccf.ccf1509;

abstract class Animal {
	abstract void say();
}

public class Cat extends Animal {
	public Cat() {
		System.out.printf("I am a cat");
	}

	public static void main(String[] args) {
		double d = 3.2; int n = 3;
		System.out.println((d-0.2)/3);
	}

	@Override
	void say() {

	}
}