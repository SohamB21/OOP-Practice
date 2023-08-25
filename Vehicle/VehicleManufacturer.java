package MyPackage;

abstract class VehicleManufacturer{
    private String vehicleName;
    private String modelName;
    public VehicleManufacturer(String vehicleName, String modelName){
        this.vehicleName = vehicleName;
        this.modelName = modelName;
    }
    public abstract void getManufacturerInfo();
    
    public String getVehicleName(){
        return vehicleName;
    }
    public void setVehicleName(String vehicleName){
        this.vehicleName = vehicleName;
    }

    public String getModelName(){
        return modelName;
    }
    public void setModelName(String modelName){
        this.modelName = modelName;
    }
}