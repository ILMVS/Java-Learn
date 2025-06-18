public enum Color {
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green"),
    BLACK("Black"),
    WHITE("White"),
    YELLOW("Yellow"),
    ORANGE("Orange"),
    PURPLE("Purple"),
    GRAY("Gray");

    private final String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}