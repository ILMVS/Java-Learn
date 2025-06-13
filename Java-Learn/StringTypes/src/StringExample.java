public class StringExample {
    public static void main(String[] args) {
        String course = "Java";
        String course2 = new String("Java");
        boolean isEqual =  course == course2; // compares references, not content
        boolean isEqualContent = course.equals(course2); // compares content
        System.out.println("isEqual = " + isEqual);
        System.out.println("isEqualContent = " + isEqualContent);
        String course3 = "Java";
        boolean isEqual3 = course == course3; // compares references, not content
        boolean isEqualContent3 = course.equals(course3); // compares content
        System.out.println("isEqual3 = " + isEqual3);
    }
}