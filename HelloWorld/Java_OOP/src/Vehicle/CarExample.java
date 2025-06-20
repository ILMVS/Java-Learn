package Vehicle;

import Common.Color;

public class CarExample {
            public static void main(String[] args) {

                // Create a new Vehicle.Car object
                Car toyota = new Car("Toyota", "Corolla", new Engine(1.6, EngineType.GASOLINE), Color.BLUE, new FuelTank(60), CarType.SEDAN);
                System.out.println(toyota.showDetails());
                System.out.println(toyota.accelerateAndBrake(100));
                System.out.println("Fuel consumption: " + toyota.calculateFuelConsumption(10, 60) + " L/km");

                Car mazda = new Car("Mazda", "CX-5", new Engine(2.1, EngineType.DIESEL));
                System.out.println(mazda.showDetails());
                System.out.println(mazda.accelerateAndBrake(100));
                System.out.println("Fuel consumption: " + mazda.calculateFuelConsumption(10, 0.2f) + " L/km");
                System.out.println("Fuel consumption: " + mazda.calculateFuelConsumption(10, 20) + " L/km");
            }
        }