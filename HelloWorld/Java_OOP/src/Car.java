//pojo plain old java object
public class Car {
    // Attributes
    private String brand;
    private String model = "red";
    private Engine engine;
    private Color color;
    private CarType carType ;
    private FuelTank fuelTank;
    private Person owner;
    private Wheel[] wheels;

    //final variables are constants, they cannot be changed
    static final String defaultColor = "Orange";

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //the constructor is a special method to allow initialization of the object
    public Car(String brand, String model, Engine engine, Color color, FuelTank fuelTank,CarType carType) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.fuelTank = fuelTank;
        this.carType = carType;
    }

    //overloaded constructor
    public Car(String brand, String model, Engine engine) {
        this(brand, model, engine , Color.RED, new FuelTank(50), CarType.SEDAN);
    }


    public String showDetails() {
        return "\ncar details: \n" +
                "Brand: " + this.brand + "\n" +
                "Model: " + this.model + "\n" +
                "Displacement: " + this.engine.getDisplacement() + "\n" +
                "Default color "+ defaultColor + "\n" +
                "Fuel Tank: " + this.fuelTank.getCapacity() + " \n" +
                "Car Type: " + this.carType.getTypeName() + "\n" +
                "Color: " + this.color.getColorName();
    }

    public String accelerate(int rpm) {
        return "The car is accelerating to " + rpm + " RPM.";
    }

    public String brake() {
        return "The car is braking.";
    }
    public String accelerateAndBrake(int rpm) {
        String acceleration = accelerate(rpm);
        String braking = brake();
        return acceleration + "\n" + braking;
    }

    public float calculateFuelConsumption(int distance, float gasPercentage) {
        return (distance * 10) / (this.fuelTank.getCapacity() * gasPercentage);
    }

    // Overloaded method
    // Polymorphism is a feature that allows methods to have the same name but different parameters.
    public float calculateFuelConsumption(int distance, int gasPercentage) {
        return (distance * 10) / (this.fuelTank.getCapacity() * (gasPercentage / 100.0f));
    }

    //Overriding equals method to compare Car objects based on their attributes
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Car car))
            return false;

        return engine.equals(car.engine ) &&
                fuelTank.getCapacity() == car.fuelTank.getCapacity() &&
                brand.equals(car.brand) &&
                model.equals(car.model) &&
                color.equals(car.color);
    }

    @Override
    public  String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'';
    }
}
