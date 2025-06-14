import java.lang.reflect.Method;
import java.sql.Struct;

public class ExampleGetClass {
    public static void main(String[] args) {
        String test = "Hello, World!";
        Class strClass = test.getClass();
        System.out.println("strClass = " + strClass);
        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass.getCanonicalName());
        System.out.println("strClass = " + strClass.getTypeName());
        System.out.println("strClass = " + strClass.getPackageName());

        for(Method method : strClass.getMethods()) {
            System.out.println("Method: " + method.getName());
        }

        Integer num = 100;
        Class numClass = num.getClass();
        Class objectClass = numClass.getSuperclass().getSuperclass();
        System.out.println("numClass = " + numClass.getSuperclass());
        System.out.println("numClass = " + objectClass);
        for(Method method : objectClass.getMethods()) {
            System.out.println("Method: " + method.getName());
        }
    }
}
