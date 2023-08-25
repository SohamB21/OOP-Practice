package MyPackage;

public class Author{
    private String authorName;
    private String penName;
    
    Author(String a, String p){
        this.authorName = a;
        this.penName = p;
    }
    public String toString(){
        String authPen = authorName+" ( "+penName+" )";
        return authPen;
    }
}