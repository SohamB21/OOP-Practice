package MyPackage;

/* Q.5) Lexus a leading vehicle manufacturer has organised a competition to help select the design of their next
 * generation. It manufactures a range of passenger cars based on different engine configuration. To win the
 * competition, participants must a create a design that caters to all different models of car company and create
 * prod of concept.Task Details: 
 * 1) The internal combustion engines vary based on the fuel they use. Petrol, Diesel, CNG, Electric. 
 * 2) Common attributes like model no, displacement, max power, max rpm, no of cylinders. 
 * 3) Electric engine will have specific attribute like voltage.
 * */
public class EngineImplementation{
    public static void main(String args[]){
        Petrol pet = new Petrol("This is Petrol Model", 1000, 500, true);
        pet.display();
        
        Diesel dies = new Diesel("This is Diesel Model", 2000, 400, false);
        dies.display();
        
        Electric elec = new Electric("This is Electric Model", 3000, 300, true);
        elec.display();
        
        Cng cng = new Cng("This is Cng Model", 1000, 200, false);
        cng.display();
    }
}
