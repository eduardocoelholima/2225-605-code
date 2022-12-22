package classes.enumType;

/**
 * Example of how to use a Enum type in a
 * switch statement
 */
public class EnumTest {
    public static void tellItLikeItIs(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    /**
     * Main method
     * @param args arguments ignored.
     */
    public static void main(String[] args) {
        tellItLikeItIs(Day.MONDAY);
        tellItLikeItIs(Day.WEDNESDAY);
        tellItLikeItIs(Day.FRIDAY);
        tellItLikeItIs(Day.SATURDAY);
        for (Day p : Day.values()) {
            System.out.printf("%s is day number %d%n", p, p.getDayOfWeek());
        }
    }
}

