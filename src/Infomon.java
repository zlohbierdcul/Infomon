import java.util.Objects;

public class Infomon {
    private String myName;
    private String myType;
    private int myAttackStat;
    private int myDefenceStat;

    public Infomon(String name, String type, int attackStat, int defenseStat) {
        this.myName = name;
        this.myType = type;
        this.myAttackStat = Math.max(attackStat, 0);
        this.myDefenceStat = Math.max(defenseStat, 0);
    }

    public int getAttackStat() {
        return myAttackStat;
    }

    public void setAttackStat(int attackStat) {
        myAttackStat = attackStat;
    }

    public int getDefenceStat() {
        return myDefenceStat;
    }

    public void setDefenceStat(int defenceStat) {
        myDefenceStat = defenceStat;
    }

    public boolean isStronger(Infomon enemy) {
        int tempStat = myAttackStat;
//        if (Objects.equals(myType, "fire") && Objects.equals(enemy.myType, "fire")) {
//
//        }
        if (Objects.equals(myType, "fire") && Objects.equals(enemy.myType, "earth")) {
            tempStat = myAttackStat * 2;
        }
        else if (Objects.equals(myType, "fire") && Objects.equals(enemy.myType, "water")) {
            tempStat = myAttackStat / 2;
        }
//        if (Objects.equals(myType, "water") && Objects.equals(enemy.myType, "water")) {
//
//        }
        else if (Objects.equals(myType, "water") && Objects.equals(enemy.myType, "fire")) {
            tempStat = myAttackStat * 2;
        }
        else if (Objects.equals(myType, "water") && Objects.equals(enemy.myType, "earth")) {
            tempStat = myAttackStat / 2;
        }
//        if (Objects.equals(myType, "earth") && Objects.equals(enemy.myType, "earth")) {
//            myAttackStat = myAttackStat;
//        }
        else if (Objects.equals(myType, "earth") && Objects.equals(enemy.myType, "fire")) {
            tempStat = myAttackStat / 2;
        }
        else if (Objects.equals(myType, "earth") && Objects.equals(enemy.myType, "water")) {
            tempStat = myAttackStat * 2;
        }
        return tempStat > enemy.myDefenceStat;
    }

    public boolean isWeaker(Infomon enemy) {
        int tempStat = enemy.myAttackStat;
//        if (Objects.equals(myType, "fire") && Objects.equals(enemy.myType, "fire")) {
//
//        }
        if (Objects.equals(myType, "fire") && Objects.equals(enemy.myType, "earth")) {
            tempStat = myAttackStat * 2;
        }
        else if (Objects.equals(myType, "fire") && Objects.equals(enemy.myType, "water")) {
            tempStat = myAttackStat / 2;
        }
//        if (Objects.equals(myType, "water") && Objects.equals(enemy.myType, "water")) {
//
//        }
        else if (Objects.equals(myType, "water") && Objects.equals(enemy.myType, "fire")) {
            tempStat = myAttackStat * 2;
        }
        else if (Objects.equals(myType, "water") && Objects.equals(enemy.myType, "earth")) {
            tempStat = myAttackStat / 2;
        }
//        if (Objects.equals(myType, "earth") && Objects.equals(enemy.myType, "earth")) {
//            myAttackStat = myAttackStat;
//        }
        else if (Objects.equals(myType, "earth") && Objects.equals(enemy.myType, "fire")) {
            tempStat = myAttackStat / 2;
        }
        else if (Objects.equals(myType, "earth") && Objects.equals(enemy.myType, "water")) {
            tempStat = myAttackStat * 2;
        }
        return tempStat > myDefenceStat;
    }


    public void transform() {
        switch (myType) {
            case "earth":
                myAttackStat += 200;
                myDefenceStat += 200;
            case "water":
                myAttackStat += 100;
                myDefenceStat += 300;
            case "fire":
                myAttackStat += 300;
                myDefenceStat += 100;
        }
    }
}
