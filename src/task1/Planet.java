package task1;

public enum Planet {
    Uranus(30687),
    Earth(365),
    Jupiter(4333),
    Mercury(88),
    Mars(687),
    Neptune(60200),
    Saturn(10759),
    Venus(225);

    private int daysInYear;

    Planet(int daysInYear) {
        this.daysInYear = daysInYear;
    }

    public int getDays() {
        return daysInYear;
    }

    @Override
    public String toString() {
        return String.format("%s has %d days of the year ", this.name(), daysInYear);
    }
}
