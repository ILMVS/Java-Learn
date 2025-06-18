public enum CarType {
    SEDAN("Sedan",5,"A sedan is a passenger car in a three-box configuration with separate compartments for engine, passenger, and cargo."),
    SUV("SUV",5,"An SUV, or sport utility vehicle, is a versatile vehicle that combines elements of road-going passenger cars with off-road vehicles."),
    COUPE("Coupe",2,"A coupe is a closed two-door car body style with a fixed roof, typically sporty in nature."),
    CONVERTIBLE("Convertible",2,"A convertible is a car with a roof structure that can be 'converted' to allow open-air or enclosed driving."),
    HATCHBACK("Hatchback",5,"A hatchback is a car design featuring a rear door that swings upwards, providing access to the car's interior."),
    PICKUP("Pickup",3,"A pickup truck is a light motor vehicle with an open-top rear cargo area, known for its utility and versatility.");

    private final String typeName;
    private final int doorsNumber;
    private final String description;


    CarType(String typeName , int doorsNumber, String description) {
        this.typeName = typeName;
        this.doorsNumber = doorsNumber;
        this.description = description;
    }

    public String getTypeName() {
        return typeName + " (" + doorsNumber + " doors)" + " - " + description;
    }

    public CarType[] getAllCarTypes() {
        return CarType.values();
    }
}
