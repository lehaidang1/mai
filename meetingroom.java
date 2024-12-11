
package ex9;


public class meetingroom extends room {
    int capacity ;

    public meetingroom(int capacity, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public double calCost () {
        if (getCapacity() > 50 ) {
            return baseCost *1.2 ;
        }
        else {
            return baseCost ;
        }
    }
    @Override
    public void display () {
        super.display();
        System.out.println("capacity is : " + capacity );
    }
    @Override
    public void update (String id) {
        if (this.id.equals(id)) {
            super.update(id);
            System.out.println("update capacity : "); capacity = input.nextInt() ;
        }
    }
    @Override
    public void enter () {
        super.enter();
        System.out.println("enter capacity : "); capacity = input.nextInt() ;
    }
}
