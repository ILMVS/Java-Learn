import java.util.Random;

public class CircleAre {
    public static void main(String[] args) {
        Random random = new Random();
        double radius = random.nextDouble() * 10;
        System.out.println("te radius of the circle is: " + radius);
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area);
    }
}
