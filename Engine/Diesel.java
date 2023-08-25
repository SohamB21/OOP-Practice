package MyPackage;

public class Diesel extends Engine{
    private boolean sound;
    
    Diesel(String mod, double disp, double max, boolean sou){
        super(mod, disp, max);
        this.sound = sou;
    }
    public void display(){
        super.displayEngine();
        System.out.println("Sound = "+sound);
    }
}