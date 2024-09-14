package Vehicle;

public class LeatherSeatsDecorator extends VehicleDecorator{
	public LeatherSeatsDecorator(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription() + ", Leather Seats";
    }

    @Override
    public double getCost() {
        return decoratedVehicle.getCost() + 2500; // cost of adding leather seats
    }
}
