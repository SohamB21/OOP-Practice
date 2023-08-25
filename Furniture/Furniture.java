package MyPackage;

public class Furniture{
    private long code;
    private String type;
    private String color;
    private int grade;
    private String use;
    private double price;
    
    //constructor
    Furniture(long code, String type, String color, int grade, String use){
        this.code = code;
        this.type = type;
        this.color = color;
        this.grade = grade;
        this.use = use;
        if(this.grade == 1)
            this.price = 5000;
        else if(this.grade == 2)
            this.price = 3000;
        else
            this.price = 1000;
    }
    
    //getters
    public long getCode(){
        return this.code;
    }
    public String getType(){
        return this.type;
    }
    public String getColor(){
        return this.color;
    }
    public int getGrade(){
        return this.grade;
    }
    public String getUse(){
        return this.use;
    }
    public double getPrice(){
        return this.price;
    }
    
    //setters
    public void setCode(long newCode){
        this.code = newCode;
    }
    public void setType(String newType){
        this.type = newType;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public void setGrade(int newGrade){
        this.grade = newGrade;
    }
    public void setUse(String newUse){
        this.use = newUse;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    
    public void display(Furniture fur){
        System.out.println("Code: "+ fur.getCode());
        System.out.println("Type: "+ fur.getType());
        System.out.println("Color: "+ fur.getColor());
        System.out.println("Grade: "+ fur.getGrade());
        System.out.println("Use: "+ fur.getUse());
        System.out.println("Price: "+ fur.getPrice());
    }
}