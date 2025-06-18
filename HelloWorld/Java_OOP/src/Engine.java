public class Engine {
    private double displacement;
    private EngineType engineType;

    public Engine(double displacement, EngineType engineType) {
        this.displacement = displacement;
        this.engineType = engineType;
    }

    public Engine() {
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
