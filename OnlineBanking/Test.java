package MyPackage;

/* Q.3) Online Banking: Today, life at your doorstep has become a way of life. Performing routine tasks has become
 * quite simple as many companies have started providing services online. Banking services are also mainly online
 * but to open an account, one must visit a bank in person. Mary global banks have ventured into the new era of
 * banking. They allow the customers to open a bank account from the comfort of their homes. Cause State Bank now
 * holds an option to open an account on its online platform. The bank provides this service to individuals who are
 * 18 or older. However, not all types of accounts can be opened online. Currently the bank only allows to make the
 * Savings account online. Create objects and define getter/setter for the savings account class Savings account. 
 * Must here some basic attributes:  i) 12 digit auto-generated account no. ii)the account holder's name iii) acc. 
 * balance iv) acc. status. The customer must be able to withdraw cash, check their balance, and transfer funds. */
public class Test{
    public static void main(String args[]){
        SavingsAcc user = new SavingsAcc("Soham", 20, 1000, "012345678912");
        
        if(user.checkDetails()){
            user.displayDetails();
            user.withdraw(500);
            user.deposit(1000);
            user.displayDetails();
        }
        else
            System.out.println("You are not eligible to open an account");
    }
}
