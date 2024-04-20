public class ConcreateVehicleFactory extends VehicleFactory{
	public IFactory getVehicle(String vehicle) {
        switch (vehicle) {
            case "Scooter":
                return (IFactory) new Scooter();
            case "Bike":
                return (IFactory) new Bike();
            default:
            	 System.out.println("Vehicle " + vehicle + " cannot be created");
        }
		return null;
    }
}
