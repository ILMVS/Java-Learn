package MusicInstrument;

public class Guitar extends MusicInstrument {

    public Guitar(String name, GuitarType type, String brand, String color) {
        super(name, type.toString(), brand, color);
    }

    public void setType(GuitarType type) {
        super.setName(type.toString());
    }

    @Override
    public void play() {
        System.out.println("Strumming the guitar:" + getName() + " Type:" + getType());
    }

    @Override
    public void iLoveMyInstrument() {
        System.out.println("I love my guitar " + getName() + " of type " + getType() + " from brand " + getBrand() + " in color " + getColor());
    }
}
