package de.mmerwar.sandbox.vehicles;

/**
 * Created by maximilian.merwar on 15.03.2017.
 */
public interface Vehicle {

    static String sound(){
        return "Whrooom";
    }

    default String getVehicle(){
        return "Nice vehicle";
    }
}
