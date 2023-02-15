package com.driver;

public class Boat implements WaterVehicle{
    @Override
    public int getVehicleCapacity() {
        return 0;
    }

    public String getVehicleName(){
        return "Kappal";
    }
}
