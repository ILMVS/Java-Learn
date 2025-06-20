package MusicInstrument;

import java.util.ArrayList;

public class MusicInstrumentTest {
    public static void main(String[] args) {
        ArrayList<MusicInstrument> instruments = new ArrayList<MusicInstrument>() {{
            add(new Piano("Nord", PianoType.GRAND, "Steinway", "Black"));
            add(new Guitar("Fender", GuitarType.STRATOCASTER, "Fender", "Sunburst"));
            add(new Piano("Luxury", PianoType.UPRIGHT, "Yamaha", "White"));
            add(new Guitar("Gibson", GuitarType.ACOUSTIC, "Gibson", "Natural"));
            add(new Piano("RX10", PianoType.ELECTRIC, "Roland", "Red"));
            add(new Guitar("Ibanez", GuitarType.DREADNOUGHT, "Ibanez", "Black"));
        }};
        playInstruments(instruments);
        //size remove and contains
        System.out.println("Number of instruments: " + instruments.size());
        instruments.remove(0); // Remove the first instrument
        System.out.println("After removing the first instrument, number of instruments: " + instruments.size());
        //Cant Create a new instrument to compare with the first one coz it is a reference type
        System.out.println("Contains Fender guitar: " + instruments.contains(instruments.get(0)));
        //for reference type we can use equals method
        System.out.println("Contains Fender guitar: " + instruments.get(0).equals(new Guitar("Fender", GuitarType.STRATOCASTER, "Fender", "Sunburst")));
        System.out.println("Contains Fender guitar: " + instruments.get(0).getName().equals("Fender"));



    }

    public static void playInstruments(ArrayList<MusicInstrument> instruments) {
        for (MusicInstrument instrument : instruments) {
            instrument.play();
        }
    }
}
