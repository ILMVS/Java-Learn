public class StringExampleInValidation {
    public static void main(String[] args) {
        String course = null;

        boolean isNull = course == null;

        System.out.println("isNull = " + isNull);

        if(!isNull) {
            System.out.println(course.toUpperCase());
            System.out.println("Welcome to the course: ".concat(course));
        }
        System.out.println("Welcome to the course: " + course);
        course ="";
        boolean isEmpty = course.isEmpty();
        boolean isEmpty2 = course.length() == 0;
        boolean isBlank = course.isBlank();

        System.out.println("isEmpty = " + isEmpty);
        System.out.println("isEmpty2 = " + isEmpty2);
        System.out.println("isBlank = " + isBlank);


    }
}