public class PrimitiveChars {
    //character

    public static void main(String[] args) {
        char arithmetic = 64; // single character
        char unicodeChar = '\u0040'; // Unicode character
        char symbol = '@'; // special character

        // Example usage of character variables
        System.out.println("Arithmetic Character: " + arithmetic);
        System.out.println("Unicode Character: " + unicodeChar);
        System.out.println("Symbol Character: " + symbol);

        // Demonstrating character operations
        char espace = '\u0020'; // space character
        char backspace = '\b';  // backspace character
        char tab = '\t';        // tab character
        char newline = '\n'; // newline character
        char carriageReturn = '\r'; // carriage return character
        char formFeed = '\f'; // form feed character
        char nullChar = '\0'; // null character

        //print all of them
        System.out.println("Space Character: '" + espace + "'");
        System.out.println("Backspace Character: '" + backspace + "'");
        System.out.println("Tab Character: '" + tab + "'");
        System.out.println("Newline Character: '" + newline + "'");
        System.out.println("Carriage Return Character: '" + carriageReturn + "'");
        System.out.println("Form Feed Character: '" + formFeed + "'");
        System.out.println("Null Character: '" + nullChar + "'");

        // Demonstrating character arithmetic
        char nextChar = (char) (arithmetic + 1); // incrementing character
        System.out.println("Next Character after " + arithmetic + ": " + nextChar);
    }
}
