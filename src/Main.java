import javax.naming.NameNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws NameNotFoundException {
        Infomon bisa = new Infomon("bisasam", "earth", 100, 100);
        Infomon knofi = new Infomon("knofensa", "earth", 100, 100);
        Infomon gluri = new Infomon("glumanda", "fire", 500, 500);
        Infomon schiggy = new Infomon("schiggy", "water", 1000, 300);


//        System.out.println("Knof stronger than Bisa");
//        System.out.println(infomon2.isStronger(infomon));


        Trainer me = new Trainer("jager");
        me.calculateTrainerPoints();
        me.printTrainerPoints();

        System.out.println(me.attemptToCatch(bisa));
        System.out.println(me.attemptToCatch(knofi));
        System.out.println(me.attemptToCatch(gluri));

        System.out.println(bisa.isStronger(knofi));

    }
}
