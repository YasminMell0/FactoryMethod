public class Program {
    public static void main(String[] args) {
    	VehicleFactory factory = new ConcreateVehicleFactory();

        IFactory scooter = factory.getVehicle("Scooter");
        scooter.drive(10);

        IFactory bike = factory.getVehicle("Bike");
        bike.drive(20);
        
        System.out.print("Finish program");
    }
}