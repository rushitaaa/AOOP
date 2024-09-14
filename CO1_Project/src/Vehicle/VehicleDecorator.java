package Vehicle;

public abstract class VehicleDecorator implements Vehicle {
	protected Vehicle decoratedVehicle;

    public VehicleDecorator(Vehicle vehicle) {
        this.decoratedVehicle = vehicle;
    }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedVehicle.getCost();
    }
}
