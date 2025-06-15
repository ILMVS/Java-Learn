import java.util.Properties;

public class SystemPropertiesExample {
    public static void main(String[] args) {
        String userName = System.getProperty("user.name");
        System.out.println("userName = " + userName);

        String Home = System.getProperty("user.home");
        System.out.println("Home = " + Home);

        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);

        String JavaVersion = System.getProperty("java.version");
        System.out.println("JavaVersion = " + JavaVersion);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator + "new line" );

        Properties p = System.getProperties();
        p.list(System.out);



    }
}
