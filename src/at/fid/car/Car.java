package at.fid.car;

import java.util.Random;

import at.fid.car.exceptions.CarException;
import at.fid.car.exceptions.EngineException;

public class Car {
    private Engine engine;

    public Car(Engine e) {
        this.engine = e;
    }

    public void startCar() throws EngineException, CarException {
        Random r = new Random();
        engine.start();
        if (r.nextBoolean()) {
            throw new CarException("Auto hat ein technischen Defekt!");
        }
    }
}
