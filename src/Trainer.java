import java.util.regex.*;


public class Trainer {
    private String name;
    private int firePoints, waterPoints, grassPoints;

    // Constructor sets the name variable to the passed in name
    // if it matches the given pattern.
    Trainer(String trainerName) {
        if (checkName(trainerName)) {
            this.name = trainerName;
        } else {
            System.exit(99);    // Terminate program if not matching pattern
        }
    }

    // Checks if name is exactly 5 char long
    public boolean checkName(String trainerName) {
        String pattern = ("\\w{5}");

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(trainerName);
        return m.matches();
    }

    // Checks if char in name gives trainer firePoint
    public boolean checkFire(String charac) {
        String pattern = ("[a-i]");

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(charac);
        return m.matches();
    }

    // Checks if char in name gives trainer waterPoints
    public boolean checkWater(String charac) {
        String pattern = ("[j-r]");

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(charac);
        return m.matches();
    }

    // Checks if char in name gives the trainer grassPoints
    public boolean checkGrass(String charac) {
        String pattern = ("[s-z]");

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(charac);
        return m.matches();
    }

    // Calculates the trainerPoints by checking each char in the name
    public void calculateTrainerPoints() {
        for (int i = 0; i < 5; i ++) {      // iterating through the char of the name
            String charAtI = String.valueOf(name.charAt(i));
            if (checkFire(charAtI)) {
                firePoints++;
            } else if (checkWater(charAtI)) {
                waterPoints++;
            } else if (checkGrass(charAtI)) {
                grassPoints++;
            }
        }
    }

    // Checks if the trainer has enough trainerPoints to catch the Infomon
    public boolean attemptToCatch(Infomon infomon) {
        boolean caught = false;

        calculateTrainerPoints();

        switch (infomon.getType()) {
            case "fire":
                if (firePoints >= 2) { caught = true; }
            case "water":
                if (waterPoints >= 2) { caught = true; }
            case "grass":
                if (grassPoints >= 2) { caught = true; }
        }
        return caught;
    }

    // Printing the trainerPoints
    public void printTrainerPoints() {
        System.out.println("FirePoints: " + firePoints);
        System.out.println("WaterPoints: " + waterPoints);
        System.out.println("GrassPoints: " + grassPoints);
    }

}



