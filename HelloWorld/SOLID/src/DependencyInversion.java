public class DependencyInversion {
    public static void main(String[] args) {
        // Create a new user
        User user = new User("John Doe", "");
    }
}

//here the lightbulb is a concrete implementation of a device that can be switched on and off.
// This violates the Dependency Inversion Principle because
// the Switch class depends on a concrete implementation (LightBulb).

//class LightBulb {
//    public void turnOn() {
//        System.out.println("La bombilla está encendida");
//    }
//
//    public void turnOff() {
//        System.out.println("La bombilla está apagada");
//    }
//}
//
//class Switch {
//    private LightBulb bulb;
//
//    public Switch(LightBulb bulb) {
//        this.bulb = bulb;
//    }
//
//    public void operate(String command) {
//        if (command.equals("ON")) {
//            bulb.turnOn();
//        } else if (command.equals("OFF")) {
//            bulb.turnOff();
//        }
//    }
//}

// In this example, we will create a Switchable interface that defines the methods for turning on and off devices.
// The Switch class will depend on this interface instead of a concrete implementation.
interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("La bombilla está encendida");
    }

    public void turnOff() {
        System.out.println("La bombilla está apagada");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("El ventilador está encendido");
    }

    public void turnOff() {
        System.out.println("El ventilador está apagado");
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(String command) {
        if (command.equals("ON")) {
            device.turnOn();
        } else if (command.equals("OFF")) {
            device.turnOff();
        }
    }
}
