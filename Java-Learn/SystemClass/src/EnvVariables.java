import java.util.Map;

public class EnvVariables {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("Environment Variables:" + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);
    }
}
