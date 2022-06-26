public class Main {

    public static void main(String[] args) {
        Infomon infomon = new Infomon("bisasam", "fire", 500, 600);
        Infomon enemy = new Infomon("flamie", "fire", 600, 200);

        System.out.println(infomon.isStronger(enemy));
        System.out.println(infomon.isWeaker(enemy));
        infomon.transform();
        System.out.println(infomon.getAttackStat());
        System.out.println(infomon.getDefenceStat());

    }
}
