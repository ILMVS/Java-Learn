public class CLIArguments {
    public static void main(String[] args) {
        for(String arg : args) {
            System.out.println("Argument: " + arg);

        //          CMD
        //          javac CLIArguments.java
        //          java CLIArguments andres pepe "juan perez" -encoding UTF-8 -verbose

            // Example of parsing arguments
            if (arg.startsWith("-")) {
                String[] parts = arg.split("=");
                if (parts.length == 2) {
                    System.out.println("Option: " + parts[0] + ", Value: " + parts[1]);
                } else {
                    System.out.println("Option: " + parts[0]);
                }
            }

        }
    }
}
