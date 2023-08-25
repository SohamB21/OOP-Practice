package MyPackage;

/*Q.2) Furniture Mask: A company manufactures plastic furniture in different colors such as red, blue and green.
 * Plastic furniture comes in three grades - Grade 1, 2, 3. The furniture manufacture is for both indoor & outdoors. 
 * The types of furniture manufactured are tables, chairs, cupboards, stools. The company is giving 5% discount who 
 * ordered G1 outdoor furniture. Declare the private attributes — furniture code, type, grade, color, use, price.*/
 
public class FurnitureImplementation{
    public static void main(String args[]){
        Furniture fur = new Furniture(1011, "Chair", "Red", 2, "Outdoor");
        
        if(fur.getGrade()==1 && fur.getUse().equalsIgnoreCase("Outdoor")){
            double p = fur.getPrice();
            p = p - (p*0.05);
            fur.setPrice(p);
        }
        else
            fur.setPrice(fur.getPrice());
        fur.display(fur);
    }
}
