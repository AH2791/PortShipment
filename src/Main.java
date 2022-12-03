import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How Many Products Have Been Ordered");
        int pnumber = sc.nextInt();
        AContainer AC = new AContainer();
        int csize = AC.getSize();
        int cnumber = pnumber / csize;
        System.out.println("Enter Info  As The Following Format:\n" +
                "► First Name \n" +
                "► Last Name \n" +
                "► Phone Number \n" +
                "► Email \n" +
                "► Product Name \n" +
                "► Product Type");
        for (int i=1; i <= pnumber ; i++){
            String fname = sc.next();
            String lname = sc.next();
            int phonenumber = sc.nextInt();
            String email = sc.next();
            Receiver R = new Receiver(fname, lname, phonenumber, email);
            String pname = sc.next();
            String ptype = sc.next();
            Product P = new Product(pname,ptype,i,R );
            for (int j=1 ; j<=cnumber; j++){
                AContainer ac = new AContainer(j);
                for (int g=1 ; g <= csize; g++){
                    ac.Push(P);
                }
            }

        }

    }
}