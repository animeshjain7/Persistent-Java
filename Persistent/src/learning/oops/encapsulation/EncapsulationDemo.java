package learning.oops.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student("Animesh", 20, "Home");
		s.setName("Jain");
//		s.address = "house"; //can't be able to access because data members are private only through setters and getters be able to change them
		System.out.println(s.getAddress() + s.getName());
	}

}
