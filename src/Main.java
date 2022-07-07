public class Main {

    public static void main(String[] args) {
        Infomon bisa = new Infomon("bisasam", "grass", 101, 100);
        Infomon knofi = new Infomon("knofensa", "grass", 100, 100);
        Infomon gluri = new Infomon("glumanda", "fire", 500, 500);
        Infomon schiggy = new Infomon("schiggy", "water", 1000, 300);



        Trainer me = new Trainer("aaaaa");

        System.out.println(me.attemptToCatch(bisa));
        System.out.println(me.attemptToCatch(knofi));
        System.out.println(me.attemptToCatch(gluri));

        System.out.println(bisa.getName() + " stronger " + knofi.getName() + "? | " + bisa.isStronger(knofi));

    }
}
