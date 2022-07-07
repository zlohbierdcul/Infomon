import java.util.Objects;

public class Infomon {
    private final String myType, myName;
    private int myAttackStat, myDefenceStat;

    // Constructor sets the name, type, attackStat,
    Infomon(String name, String type, int attackStat, int defenseStat) {
        this.myName = name;
        this.myType = type;
        this.myAttackStat = Math.max(attackStat, 0); // returns the greater of two int values
        this.myDefenceStat = Math.max(defenseStat, 0);
    }

    // Getter methods
    public int getAttackStat() {
        return myAttackStat;
    }
    public int getDefenceStat() {
        return myDefenceStat;
    }
    public String getType() {
        return myType;
    }
    public String getName() { return myName; }

    // Checks if Infomon is stronger than enemy Infomon
    public boolean isStronger(Infomon enemy) {
        int tempAttack = getAttackStat();   // storing attackStat in temp variable so actual value isn't manipulated.

        // Checking all different cases of effectiveness and changing the temporary attackStat accordingly
        if (Objects.equals(getType(), "fire") && Objects.equals(enemy.getType(), "grass")) {
            tempAttack *= 2;
        }
        else if (Objects.equals(getType(), "fire") && Objects.equals(enemy.getType(), "water")) {
            tempAttack /= 2;
        }
        else if (Objects.equals(getType(), "water") && Objects.equals(enemy.getType(), "fire")) {
            tempAttack *= 2;
        }
        else if (Objects.equals(getType(), "water") && Objects.equals(enemy.getType(), "grass")) {
            tempAttack /= 2;
        }
        else if (Objects.equals(getType(), "grass") && Objects.equals(enemy.getType(), "fire")) {
            tempAttack /= 2;
        }
        else if (Objects.equals(getType(), "grass") && Objects.equals(enemy.getType(), "water")) {
            tempAttack *= 2;
        }

        // If the attackStat is the same then the enemy's defenceStat after checking the effectivity
        // the enemy Infomon gets transformed and the method is executed again
        if (tempAttack == enemy.myDefenceStat) {
            enemy.transform();
            isStronger(enemy);
        }

        return tempAttack > enemy.getDefenceStat();     // returning who is stronger
    }

    // Checks if Infomon is weaker than enemy Infomon
    public boolean isWeaker(Infomon enemy) {
        int enemyTempAttack = enemy.getAttackStat();    // storing enemy's attackStat in temp variable so actual value isn't manipulated.

        // Checking all different cases of effectiveness and changing the temporary attackStat accordingly
        if (Objects.equals(getType(), "fire") && Objects.equals(enemy.getType(), "grass")) {
            enemyTempAttack *= 2;
        }
        else if (Objects.equals(getType(), "fire") && Objects.equals(enemy.getType(), "water")) {
            enemyTempAttack /= 2;
        }
        else if (Objects.equals(getType(), "water") && Objects.equals(enemy.getType(), "fire")) {
            enemyTempAttack *= 2;
        }
        else if (Objects.equals(getType(), "water") && Objects.equals(enemy.getType(), "grass")) {
            enemyTempAttack /= 2;
        }
        else if (Objects.equals(getType(), "grass") && Objects.equals(enemy.getType(), "fire")) {
            enemyTempAttack /= 2;
        }
        else if (Objects.equals(getType(), "grass") && Objects.equals(enemy.getType(), "water")) {
            enemyTempAttack *= 2;
        }
        return enemyTempAttack > getDefenceStat();      // Returning who is weaker
    }

    // Transforms the Infomon
    public void transform() {
        System.out.println("Transformation!!");
        switch (getType()) {    // used enhanced switch statement so no breaks are necessary
            case "grass" -> {
                myAttackStat += 200;
                myDefenceStat += 200;
            }
            case "water" -> {
                myAttackStat += 100;
                myDefenceStat += 300;
            }
            case "fire" -> {
                myAttackStat += 300;
                myDefenceStat += 100;
            }
            default -> {
                System.out.println("Unknown type!");
            }
        }
    }
}
