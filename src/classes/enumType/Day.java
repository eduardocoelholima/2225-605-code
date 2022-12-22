package classes.enumType;

/**
 * Example of a Enum type for the day of the weeks
 */
public enum Day {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    /**
     * numeric representation
     * of the day of the week
     */
    private int dayOfWeek;
    Day(int dayOfWeek){
        this.dayOfWeek = dayOfWeek;
    }

    public int getDayOfWeek(){
        return dayOfWeek;
    }
}
