package Vehicle;

public class AdvancedAudioSystemDecorator extends VehicleDecorator {
	public AdvancedAudioSystemDecorator(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription() + ", Advanced Audio System";
    }

    @Override
    public double getCost() {
        return decoratedVehicle.getCost() + 1000; // cost of adding an advanced audio system
    }
}
