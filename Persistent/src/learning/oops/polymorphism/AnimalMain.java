package learning.oops.polymorphism;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalSounds animal = new AnimalSounds();
		Cow cow = new Cow();
		Dog dog = new Dog();
		animal.sound();
		cow.sound();
		dog.sound();
		dog.sound("angry");
	}

}
