package MusicInstrument;

public enum GuitarType {
    ACOUSTIC, TELECASTER, STRATOCASTER, LES_PAUL, JAZZMASTER, JAGUAR, DREADNOUGHT, CLASSICAL;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}