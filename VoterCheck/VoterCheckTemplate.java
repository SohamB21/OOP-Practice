package MyPackage;
/* Q.1) An election is a formal group decision making process by  which a population chooses an individual or
 * multiple individuals to hold public office. People vote for eligible candidates during the election process.
 * The eligible age to vote is 18 and above. Write a program to check if the individual is eligible to vote or 
 * not.*/
 
public class VoterCheckTemplate
{
    public static void main(String args[]){
        VoterCheck person = new VoterCheck("Soham Banik", 20, "012345");
        if(person.getAge() > 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");
    }
}