package learning.oops.inheritance;


public class MountainBike extends Bicycle {
	public int seatHeight;

	public MountainBike(int startHeight ,int startGear, int startSpeed) {
		super(startGear, startSpeed); //Super() will initialize the base class constructor
		this.seatHeight = startHeight;
	}
	
	public void setHeight(int value) {
		seatHeight = value;
	}


	 
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
