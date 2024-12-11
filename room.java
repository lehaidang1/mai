
package ex9;
import java.util.Scanner ;

public abstract class room implements iroom {
    Scanner input = new Scanner (System.in); 
    String id , name ;
    double baseCost ;

    public room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }
    @Override
    public abstract double calCost ();
    @Override
    public void display () {
        System.out.println("id is : " + id);
        System.out.println("name is : " + name);
        System.out.println("baseCost is : " + baseCost);
    }
    public void update (String id) {
        if (this.id.equals(id)) {
            System.out.println("update name : ");input.nextLine() ;
            name = input.nextLine() ;
            System.out.println("update baseCost : " ); baseCost = input.nextDouble() ;
        }
    }
    public void enter () {
        System.out.println("enter id  : " ); id = input.nextLine() ;
        System.out.println("enter name : "); name = input.nextLine() ;
        System.out.println("enter baseCost : "); baseCost = input.nextDouble() ;
    }
}
