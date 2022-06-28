import javax.naming.NameNotFoundException;
import java.util.regex.*;


public class Trainer {
    private String name = "";
    private int firePoints;
    private int waterPoints;
    private int earthPoints;


    public Trainer(String trainerName) throws NameNotFoundException {
        if (checkName(trainerName)) {
            this.name = trainerName;
        } else {
            throw new NameNotFoundException("only 5 character (a-z) names are allowed");
        }
    }

    public boolean checkName(String name) {
        String pattern = ("\\w{5}");

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(name);
        return m.matches();
    }

    public boolean checkFire(String charac) {
        String pattern = ("[a-i]");

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(charac);
        return m.matches();
    }

    public boolean checkWater(String charac) {
        String pattern = ("[j-r]");

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(charac);
        return m.matches();
    }

    public boolean checkEarth(String charac) {
        String pattern = ("[s-z]");

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(charac);
        return m.matches();
    }

    public void calculateTrainerPoints() {
        for (int i = 0; i < 5; i ++) {
            String temp = String.valueOf(name.charAt(i));
            if (checkFire(temp)) {
                firePoints++;
            } else if (checkWater(temp)) {
                waterPoints++;
            } else if (checkEarth(temp)) {
                earthPoints++;
            }
        }
    }

    public void printTrainerPoints() {
        System.out.println("FirePoints: " + firePoints);
        System.out.println("WaterPoints: " + waterPoints);
        System.out.println("EarthPoints: " + earthPoints);
    }

    public boolean attemptToCatch(Infomon infomon) {
        boolean caught = false;
        switch (infomon.getType()) {
            case "fire":
                if (firePoints >= 2) { caught = true; }
            case "water":
                if (waterPoints >= 2) { caught = true; }
            case "earth":
                if (earthPoints >= 2) { caught = true; }
        }
        return caught;
    }

}
