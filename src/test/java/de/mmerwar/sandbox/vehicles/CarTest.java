package de.mmerwar.sandbox.vehicles;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CarTest {

    @InjectMocks
    private Car car;

    @Test
    public void testSound(){
        Assert.assertEquals("Whrooom", Vehicle.sound());
    }

    @Test
    public void testVehicleText(){
        Assert.assertEquals("Fast car", car.getVehicle());
    }
}
