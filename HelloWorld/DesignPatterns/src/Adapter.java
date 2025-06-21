public class Adapter {
    public static void main(String[] args) {
        Light light = new Light();
        light.turnOn();
        System.out.println("Light is on: " + light.getIsOn());
    }
}

 class Light {
    private boolean isOn;

    public boolean getIsOn() {
        return isOn;
    }

    public void turnOn() {
         this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }
}

class LightAdapter {
    private Light light;

    public LightAdapter(Light light) {
        this.light = light;
    }

    public boolean isOn() {
        return light.getIsOn();
    }

    public void switchOn() {
        light.turnOn();
    }

    public void switchOff() {
        light.turnOff();
    }
}