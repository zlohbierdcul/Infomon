import javax.naming.NameNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws NameNotFoundException {
        Infomon infomon = new Infomon("bisasam", "earth", 500, 600);
        Infomon enemy = new Infomon("glumanda", "fire", 600, 500);
        Infomon infomon1 = new Infomon("schiggy", "water", 1000, 300);

        System.out.println(infomon.isStronger(enemy));


        Trainer me = new Trainer("jager");
        me.calculateTrainerPoints();
        me.printTrainerPoints();

        System.out.println(me.attemptToCatch(infomon));
        System.out.println(me.attemptToCatch(enemy));
        System.out.println(me.attemptToCatch(infomon1));

//        System.out.println(infomon.isWeaker(enemy));
//        infomon.transform();
//        System.out.println(infomon.getAttackStat());
//        System.out.println(infomon.getDefenceStat());
    }
}
