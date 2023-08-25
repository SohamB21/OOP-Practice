package MyPackage;

public class VoterCheck{
    private String name;
    private int age;
    private String aadharNum;
    
    //all argument constructor
    VoterCheck(String n, int a, String aN){
        this.name = n;
        this.age = a;
        this.aadharNum = aN;
    }
    
    //getters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getAadharNum(){
        return this.aadharNum;
    }
    
    //setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setAadharNum(String newAadharNum){
        this.aadharNum = newAadharNum;
    }
}