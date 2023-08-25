package MyPackage;

public class Cng extends Engine{
    private boolean gas;
    
    Cng(String mod, double disp, double max, boolean g){
        super(mod, disp, max);
        this.gas = g;
    }
    public void display(){
        super.displayEngine();
        System.out.println("Gas = "+gas);
    }
}