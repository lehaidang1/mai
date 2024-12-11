
package ex9;


public class bedroom extends room {
    int numberOfBeds ; 

    public bedroom(int numberOfBeds, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    
    @Override
    public double calCost () {
        if (getNumberOfBeds () >= 3) {
            return baseCost * 1.1 ;
        }
        else {
            return baseCost ;
        }
    }
    @Override
    public void display () {
        super.display();
        System.out.println("numberofBeds is : " + numberOfBeds);
    }
    @Override
    public void update (String id) {
        if (this.id.equals(id)) {
            super.update(id);
            System.out.println("update numberOfBeds : "); numberOfBeds = input.nextInt() ;
        }
    }
    @Override
    public void enter () {
        super.enter();
        System.out.println("enter numberOfBeds : "); numberOfBeds = input.nextInt() ;
    }
}
