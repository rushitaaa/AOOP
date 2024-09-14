package Vehicle;

public class BasicCar implements Vehicle {
	@Override
    public String getDescription() {
        return "Basic Car";
    }

    @Override
    public double getCost() {
        return 20000; // base cost of the basic car
    }
}
