
package ex9;
import java.util.ArrayList ;

public class roomlist {
    ArrayList<room> a = new ArrayList<> () ;
    void add (room b) {
        a.add(b) ;
    }
    boolean update (String id ) {
        for(room x : a) {
            if (x.id.equals(id)) {
                x.update(id);
                System.out.println("update thanh cong");
                return true ;
            }
        }
        return false ;
    }
    boolean delete (String id ) {
        for(room x : a) {
            if (x.id.equals(id)) {
                a.remove(x);
                return true ;
            }
        }
        return false ;
    }
    room find (String id ) {
        for(room x : a) {
            if (x.id.equals(id)) {
                x.display();
                return x ;
            }
        }
        System.out.println("not find");
        return null ;
    }
    void displayAll () {
        if (a.isEmpty()) {
            System.out.println("danh sach trong !!");
        }
        else {
            for(room x : a) {
                x.display();
            }
        }
    }
    room mostexpensiveroom () {
        room mostroom = a.get(0) ;
        for(room x : a) {
            if ( x.calCost() > mostroom.calCost()) {
                mostroom = x ;
                mostroom.display();
            }
        }
        return mostroom ;
    }
    void countRooms () {
        int cnt = 0 ;
        for(room x : a) {
            ++cnt ;
        }
        System.out.println("room is : " + cnt );
    }
}
