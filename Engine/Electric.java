package MyPackage;

public class Electric extends Engine{
    private boolean voltage;
    
    Electric(String mod, double disp, double max, boolean volt){
        super(mod, disp, max);
        this.voltage = volt;
    }
    public void display(){
        super.displayEngine();
        System.out.println("Voltage = "+voltage);
    }
}