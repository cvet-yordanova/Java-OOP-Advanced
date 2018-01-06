package enums_and_anotations_lab.a_weekdays;

import java.util.Comparator;

public class WeeklyEntry {
    public final static Comparator<WeeklyEntry> BY_WEEKDAY = getCompByDay();
    private Weekday weekday;
    private String notes;
    public WeeklyEntry(String weekday, String notes) {
        this.weekday = Enum.valueOf(Weekday.class, weekday.toUpperCase());
        this.notes = notes;
    }
    @Override public String toString() {
        return this.weekday+ " - "+this.notes;
    }
    private static Comparator<WeeklyEntry> getCompByDay() {
        return (e1, e2) -> e1.weekday.compareTo(e2.weekday);
    }
}
