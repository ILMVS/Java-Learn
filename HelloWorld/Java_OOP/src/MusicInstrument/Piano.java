package MusicInstrument;

public class Piano extends MusicInstrument {

    public Piano(String name, PianoType type, String brand, String color) {
        super(name, type.toString(), brand, color);
    }

    public void setType(GuitarType type) {
        super.setName(type.toString());
    }

    @Override
    public void play() {
        System.out.println("Playing the piano: " + getName() + " Type: " + getType());
    }

    @Override
    public void iLoveMyInstrument() {
        System.out.println("I love my piano " + getName() + " of type " + getType() + " from brand " + getBrand() + " in color " + getColor());
    }
}
