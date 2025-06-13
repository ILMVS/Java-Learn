public class ProgramaManejoDeNombres {

    public static void main(String[] args ) {
        String[] names = new String[] {"Juan", "jose", "Pérez", "Gómez"};

        if (names.length < 3) {
            System.out.println("Please provide at least three names.");
            return;
        }

        String name1 = nameProcessor(names[0]);
        String name2 = nameProcessor(names[1]);
        String name3 = nameProcessor(names[2]);

        String finalResult = name1 + "_" + name2 + "_" + name3;
        System.out.println(finalResult);
    }

    private static String nameProcessor(String name) {
        if (name.length() < 3) {
            return "Invalid name";
        }

        char second = Character.toUpperCase(name.charAt(1));
        String last2names = name.substring(name.length() - 2);

        return second + "." + last2names;
    }
}
