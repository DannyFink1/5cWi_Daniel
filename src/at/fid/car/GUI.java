package at.fid.car;

import at.fid.car.exceptions.CarException;
import at.fid.car.exceptions.EngineException;

public class GUI {
    public static void main(String[] args) {
        Engine e1 = new Engine(100);
        Car c1 = new Car(e1);
        try {
            c1.startCar();
        } catch (EngineException engineException) {
            System.out.println("Engine Fehler: " + engineException.getMessage());
        } catch (CarException carException) {
            System.out.println("Auto Fehler: " + carException.getMessage());
        }
    }
}
