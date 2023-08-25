package MyPackage;

public class Engine{
    private String model;
    private double displacement;
    private double maxPower;
    
    Engine(String mod, double disp, double max){
        this.model = mod;
        this.displacement = disp;
        this.maxPower = max;        
    }
    public void displayEngine(){
        System.out.println("Model = "+model);
        System.out.println("Displacement = "+displacement);
        System.out.println("Maximum Power = "+maxPower);
    }
}

