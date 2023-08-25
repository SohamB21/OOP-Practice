package MyPackage;

/* Q.7) Vehicle: John is new to Java is working on polymorphism. He wants to create a bike class and a car class. 
 * In the future, he may want to create a few more vehicles, so he wants some features to be overridden from an
 * abstract class Vehicle Manufacturer and from the an interface Vehicle. Task details: Create an abstract class 
 * Vehicle Manufacturer. Declare private instance variable, vehicle name, model name with proper datatype. Define 
 * abstract method getManufacturerInfo with string datatype. Declare interface vehicle having abstract method maxSpeed.
 * Bike class extending vehicle manufacturer and implement Vehicle interface and override all the abstract methods. 
 * For eg - if vehicle type is Sports type speed 300km. Cruiser speed 190km. Racing - 250km. Sedan - 170 km.*/

public class VehicleImplementation{
    public static void main(String args[]){
        Bike bike = new Bike("New Vehicle", "New Model", "Racing");
        //same for car obj
        
        bike.getManufacturerInfo();
        System.out.println(bike.getVehicleType()+" bike's speed = "+bike.maxSpeed());
    }
}
