package com.Test_4;
import java.util.Date;

/*) There are four classes a) Car (carId, carcolor) b) Engine
(engineid ,lastenginecleandate) c) SubEngine (subenginetype)
d) Gear (type - auto manual)
Car has Engine, Engine has SubEngine, Car also has Gear
Create Object in Object (Containment) for above scenario [2M]
*/

class Car {
    private int carId;
    private String carColor;
    private Engine engine;
    private Gear gear;

    public Car(int carId, String carColor, Engine engine, Gear gear) {
        this.carId = carId;
        this.carColor = carColor;
        this.engine = engine;
        this.gear = gear;
    }

    public int getCarId() {
        return carId;
    }

    public String getCarColor() {
        return carColor;
    }

    public Engine getEngine() {
        return engine;
    }

    public Gear getGear() {
        return gear;
    }
}

class Engine {
    private int engineId;
    private String lastEngineCleanDate;
    private SubEngine subEngine;

    public Engine(int engineId, String lastEngineCleanDate, SubEngine subEngine) {
        this.engineId = engineId;
        this.lastEngineCleanDate = lastEngineCleanDate;
        this.subEngine = subEngine;
    }

    public int getEngineId() {
        return engineId;
    }

    public String getLastEngineCleanDate() {
        return lastEngineCleanDate;
    }

    public SubEngine getSubEngine() {
        return subEngine;
    }
}

class SubEngine {
    private String subEngineType;

    public SubEngine(String subEngineType) {
        this.subEngineType = subEngineType;
    }

    public String getSubEngineType() {
        return subEngineType;
    }
}

class Gear {
    private String type;

    public Gear(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

public class Test_8 {
    public static void main(String[] args) {
        SubEngine subEngine = new SubEngine("V6");

        Engine engine = new Engine(1, "2022-01-01", subEngine);

        Gear gear = new Gear("Auto");

        Car car = new Car(1, "Red", engine, gear);

        System.out.println("Car ID: " + car.getCarId());
        System.out.println("Car Color: " + car.getCarColor());
        System.out.println("Engine ID: " + car.getEngine().getEngineId());
        System.out.println("Last Engine Clean Date: " + car.getEngine().getLastEngineCleanDate());
        System.out.println("SubEngine Type: " + car.getEngine().getSubEngine().getSubEngineType());
        System.out.println("Gear Type: " + car.getGear().getType());
    }
}
