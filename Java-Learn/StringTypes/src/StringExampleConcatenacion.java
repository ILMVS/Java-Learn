public class StringExampleConcatenacion {
    public static void main(String[] args) {
        String course = "Java";
        String teacher = "Luis Vazquez";

        String detail = "course: " + course + ", teacher: " + teacher;
        System.out.println("detail = " + detail);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detail + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detail);

        String detail2 = course.concat(" with ").concat(teacher);
        System.out.println("detail2 = " + detail2);

    }
}