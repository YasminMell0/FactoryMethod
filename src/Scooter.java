public class Scooter implements IFactory {
	@Override
	public void drive(int miles) {
	    System.out.println("Drive the Scooter : " + miles + " km");
	}
}
