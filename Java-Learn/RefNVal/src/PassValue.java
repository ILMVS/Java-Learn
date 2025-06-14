public class PassValue {

    public static void main(String[] args) {
        int i = 10;
        System.out.println("Init method with i  = " + i);
        test(i);
        System.out.println("After test method with i = " + i);

        Integer integer = Integer.valueOf(10);
        System.out.println("Init method with integer = " + integer);
        test(integer);
        System.out.println("After test method with integer = " + integer);
    }

    public static void  test(int i) {
        System.out.println("test method with i = " + i);
        i = 20;
        System.out.println("test method with i = " + i);
    }
    public static void  test(Integer i) {
        System.out.println("test2 method with i = " + i);
        i = 20;
        System.out.println("test2 method with i = " + i);
    }

}
