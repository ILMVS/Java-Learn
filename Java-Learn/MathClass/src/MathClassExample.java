import java.util.Random;

public class MathClassExample {
    public static void main(String[] args) {
        int absValue = Math.abs(-10);
        System.out.println("absolute number = " + absValue);

        double maxValue = Math.max(10.5, 20.5);
        System.out.println("max value = " + maxValue);

        double minValue = Math.min(10.5, 20.5);
        System.out.println("min value = " + minValue);

        double ceil = Math.ceil(3.5);
        System.out.println("ceil value = " + ceil);

        double floor = Math.floor(3.5);
        System.out.println("floor value = " + floor);

        double round = Math.round(3.5);
        System.out.println("round value = " + round);

        // Trigonometric functions
        double exponent = Math.exp(1);
        System.out.println("exponent value = " + exponent);

        double logValue = Math.log(10);
        System.out.println("log value = " + logValue);

        double powValue = Math.pow(2, 3);
        System.out.println("pow value = " + powValue);

        double sqrtValue = Math.sqrt(16);
        System.out.println("sqrt value = " + sqrtValue);

        double grades = Math.toDegrees(Math.PI / 4);
        grades= Math.round(grades);
        System.out.println("degrees value = " + grades);

        double radians = Math.toRadians(180);
        System.out.println("radians value = " + radians);

        //sin cos tan
        double sinValue = Math.sin(Math.PI / 2);
        System.out.println("sin value = " + sinValue);

        double cosValue = Math.cos(Math.PI);
        System.out.println("cos value = " + cosValue);

        double tanValue = Math.tan(Math.PI / 4);
        System.out.println("tan value = " + tanValue);

        // Random number generation
        double randomValue = Math.random();
        System.out.println("random value = " + randomValue);
        int randomInt = (int) (Math.random() * 100); // Random integer between 0 and 99
        System.out.println("random integer = " + randomInt);

        String[] colors = {"Red", "Green", "Blue", "Yellow", "Orange"};
        int randomIndex = (int) (Math.random() * colors.length);
        String randomColor = colors[randomInt];
        System.out.println("random color = " + randomIndex);

        Random objRandom = new Random();
        int randomInt2 = objRandom.nextInt(100);
        System.out.println("random integer using Random class = " + randomInt2);

        randomInt = objRandom.nextInt(colors.length);
        System.out.println("random color using Random class = " + colors[randomInt]);

    }
}
