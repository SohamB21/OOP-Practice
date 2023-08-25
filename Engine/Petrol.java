package MyPackage;

public class Petrol extends Engine{
    private boolean premium;
    
    Petrol(String mod, double disp, double max, boolean prem){
        super(mod, disp, max);
        this.premium = prem;
    }
    public void display(){
        super.displayEngine();
        System.out.println("Premium = "+premium);
    }
}