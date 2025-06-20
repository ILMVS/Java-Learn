package MusicInstrument;

public abstract class MusicInstrument {
    private String name;
    private String type;
    private String brand;
    private String color;

    public MusicInstrument(String name, String type, String brand, String color) {
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void play() {
        System.out.println("Playing the " + name + " of type " + type);
    }

    public void iLoveMyInstrument() {
        System.out.println("I love my " + name + " of type " + type + " from brand " + brand + " in color " + color);
    }

}

