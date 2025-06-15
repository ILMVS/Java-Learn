import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AssingNewPropertiesInSystem {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("./src/SystemClass/src/config.properties");
            Properties properties = new Properties(System.getProperties());
            properties.load(file);
            properties.setProperty("my.value","mmy value");

            System.setProperties(properties);
            System.out.println("Updated Properties:");
            System.getProperties().list(System.out);

            // Accessing a specific property
            String myValue = System.getProperty("my.value");
            System.out.println("my.value = " + myValue);

        } catch (Exception e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
