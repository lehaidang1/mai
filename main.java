
package ex9;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        roomlist a = new roomlist () ;
        while (true) {
            System.out.println("--------------Ex9--------------");
            System.out.println("1.them meetingroom");
            System.out.println("2.them bedroom");
            System.out.println("3.xoa room");
            System.out.println("4.tim room");
            System.out.println("5.in ra danh sach room");
            System.out.println("6.cap nhat room");
            System.out.println("7.tim phong dat nhat");
            System.out.println("8.dem so phong");
            System.out.print("nhap lua chon : "); 
            int lc = input.nextInt() ;
            switch (lc) {
                case 1 : 
                    meetingroom b = new meetingroom (0 ,"" , "" ,  0  ) ;
                    b.enter();
                    a.add(b);
                    break;
                case 2 :
                    bedroom c = new bedroom (0 , "" , "", 0) ;
                    c.enter();
                    a.add(c);
                    break ;
                case 3 :
                    System.out.println("nhap id phong can xoa ");
                    input.nextLine() ;
                    String deleteId = input.nextLine() ;
                    a.delete(deleteId);
                    break ;
                case 4 :
                    System.out.println("nhap id can tim");input.nextLine() ;
                    String findId = input.nextLine() ;
                    a.find(findId) ;
                    break ;
                case 5 :
                    System.out.println("----------Danh Sach--------------");
                    a.displayAll();
                    break ;
                case 6 :
                    System.out.println("nhap id can cap nhat");
                    input.nextLine() ;
                    String updateId = input.nextLine() ;
                    a.update(updateId) ;
                    break ;
                case 7 :
                    a.mostexpensiveroom() ;
                    break ;
                case 8 :
                    a.countRooms();
            }
        }
    }
}
