public class StringExampleInmutable {
    public static void main(String[] args) {
        String course = "Java";
        String teacher = "Luis Vazquez";

        String result = course.concat(" with ").concat(teacher);
        System.out.println("course = " + course);
        System.out.println("result = " + result);

        String result2 = course.transform((c) -> c.concat(" with ").concat(teacher));

        System.out.println("course after transform = " + course);
        System.out.println("result2 = " + result2);

    }
}