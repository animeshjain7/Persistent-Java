package learning.oops.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(12, 15, 3); //height gear speed
		System.out.println("the Mountain bike gear " + mb.gear);
		System.out.println("the Mountain bike speed " + mb.speed);
		System.out.println("The Mountain bike height " + mb.seatHeight);
		mb.applyBrake(1);
		System.out.println("new Speed of Mountain bike is " + mb.speed);

	}

}
