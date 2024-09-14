package Vehicle;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
        Vehicle basicCar = new BasicCar();
        System.out.println(basicCar.getDescription() + " costs $" + basicCar.getCost());

        // Add a sunroof to the car
        Vehicle carWithSunroof = new SunroofDecorator(basicCar);
        System.out.println(carWithSunroof.getDescription() + " costs $" + carWithSunroof.getCost());

        // Add leather seats and advanced audio system to the car with sunroof
        Vehicle fullyLoadedCar = new LeatherSeatsDecorator(new AdvancedAudioSystemDecorator(carWithSunroof));
        System.out.println(fullyLoadedCar.getDescription() + " costs $" + fullyLoadedCar.getCost());
    }
}
