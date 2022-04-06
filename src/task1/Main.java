package task1;

public class Main {

    public static void main(String[] args) {

        Planet[] planets = Planet.values();
//        Planet minDays = findLessDaysOfYearOnPlanet(planets);
//        System.out.println(minDays);
//        Planet moreDays = findMoreDaysOfYearOnPlanet(planets);
//        System.out.println(moreDays);
        System.out.println("Unsorted planets");
        printElementaryOfArray(planets);

        System.out.println("Sorted planets");
        Planet[] sortedPlanet = sortPlanet(planets);
        printElementaryOfArray(sortedPlanet);
    }

    public static void printElementaryOfArray(Planet[] planets) {
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }

    public static Planet[] sortPlanet(Planet[] planets) {
        for (int i = 0; i < planets.length; i++) {
            for (int j = i+1; j < planets.length; j++) {
                if (planets[i].getDays()>planets[j].getDays()) {
                    Planet temp = planets[i];
                    planets[i] = planets[j];
                    planets[j] = temp;
                }
            }
        }
        return planets;
    }

    public static Planet findLessDaysOfYearOnPlanet(Planet[] planets) {
        Planet lessDays = null;
        for (Planet pl:planets) {
            if (lessDays==null) {
                lessDays=pl;
                continue;
            }
            if (lessDays.getDays()>pl.getDays()) {
                lessDays=pl;
            }
        }
        return lessDays;
    }

    public static Planet findMoreDaysOfYearOnPlanet(Planet[] planets) {
        Planet moreDays = null;
        for (Planet pl:planets) {
            if (moreDays==null) {
                moreDays=pl;
                continue;
            }
            if (moreDays.getDays()<pl.getDays()) {
                moreDays=pl;
            }
        }
        return moreDays;
    }
}
