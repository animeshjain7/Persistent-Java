package learning.oops.inheritance;

public class Bicycle {
	protected int gear;
	protected int speed;
	 public Bicycle(int startGear, int startSpeed) {
		gear = startGear;
		speed = startSpeed;
	 }
	 
	 public void setGear(int value) {
		 	gear = value;
	 }
	 public void setSpeed(int value) {
		 	speed = value;
	 }
	 
	 public void applyBrake(int decrement) {
		 speed -= decrement;
	 }
	 
	 public void speedUp(int increment) {
		 speed += increment;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
