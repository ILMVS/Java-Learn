public class Wheel {
    private String brand;
    private int size;
    private int pressure;

    public Wheel(String brand, int size, int pressure) {
        this.brand = brand;
        this.size = size;
        this.pressure = pressure;
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public int getPressure() {
        return pressure;
    }
}
