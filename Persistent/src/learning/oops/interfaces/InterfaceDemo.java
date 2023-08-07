package learning.oops.interfaces;

public class InterfaceDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(20,10,5);
		System.out.println("gear " + mb.getGear());
		System.out.println("speed " + mb.getSpeed());
		System.out.println("height " + mb.getSeatHeight());
		
		mb.applyBrake(2);
		System.out.println("After Brake the speed "+ mb.getSpeed());
		
		mb.speedUp(4);
		System.out.println("After speed up the speed is "+ mb.getSpeed());
	}

}
