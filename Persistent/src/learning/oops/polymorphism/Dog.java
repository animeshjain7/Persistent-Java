package learning.oops.polymorphism;

public class Dog extends AnimalSounds{

	public void sound() {
		System.out.println("Dog says: Bow bow");
	}		
	public void sound(String angry) {
		System.out.println("the dog is angry: Growl growl");
		super.sound();
	}
}
