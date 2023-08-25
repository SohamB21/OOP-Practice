package MyPackage;

public class Bike extends VehicleManufacturer implements VehicleInterface{
    private String vehicleType;
    Bike(String vehicleName, String modelName, String vehicleType){
        super(vehicleName, modelName);
        this.vehicleType = vehicleType;
    }
    
    @Override
    public void getManufacturerInfo(){
        System.out.println("Vehicle Name = "+super.getVehicleName());
        System.out.println("Model Name = "+super.getModelName());
    }
    
    public String getVehicleType(){
        return vehicleType;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }
    
    @Override
    public int maxSpeed(){
        if(vehicleType.equalsIgnoreCase("Sports"))
            return 300;
        else if(vehicleType.equalsIgnoreCase("Cruiser"))
            return 190;
        else if(vehicleType.equalsIgnoreCase("Racing"))
            return 250;
        else if(vehicleType.equalsIgnoreCase("Sedan"))
            return 170;
        else
            return 0;
    }
}
//same for car class