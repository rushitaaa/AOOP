package Vehicle;

public class SunroofDecorator extends VehicleDecorator {
	 public SunroofDecorator(Vehicle vehicle) {
	        super(vehicle);
	    }

	    @Override
	    public String getDescription() {
	        return decoratedVehicle.getDescription() + ", Sunroof";
	    }

	    @Override
	    public double getCost() {
	        return decoratedVehicle.getCost() + 1500; // cost of adding a sunroof
	    }
}
