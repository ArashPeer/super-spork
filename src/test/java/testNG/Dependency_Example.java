package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_Example {
    @Test
    void startCar()
    {
        System.out.println("CAR STARTED");

    }
    @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.println("CAR DRIVING");
    }
    @Test(dependsOnMethods = {"driveCar"})
    void stopCar()
    {
        System.out.println("CAR STOPPED");
    }
    @Test(dependsOnMethods = {"stopCar"})
    void parkCar()
    {
        System.out.println("CAR PARKED");
    }
}
