package MyPackage;

public class SavingsAcc
{
    String name;
    int age;
    double balance;
    String accNum;
    
    SavingsAcc(String name, int age, double balance, String accNum)
    {
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.accNum = accNum;
    }
    
    public boolean checkDetails(){
        if(age<18 || accNum.length()!=12)
            return false;
        else
            return true;
    }
    
    public void displayDetails(){
        System.out.println("User Details...");
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Balance : "+ balance);
        System.out.println("Account Number : "+ accNum + "\n");
    }
    
    public void withdraw(double amount){
        if(balance < amount)
            System.out.println("Not enough balance left. Withdrawal failed.\n");
        else{
            balance = balance - amount;
            System.out.println("Rs. "+amount+" withdrawn successfully.\n");
        }
    }
    
    public void deposit(double amount){
        balance += amount;
        System.out.println("Rs. "+amount+" deposited successfully.\n");
    }
}
