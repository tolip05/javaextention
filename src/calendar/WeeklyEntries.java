package calendar;

import java.util.Comparator;

public class WeeklyEntries {
    public final static Comparator<WeeklyEntries>BY_WEEKDAY = sortedWeekly();


    private WeekDays weekDays;
    private String notes;

    public WeeklyEntries(String weekDays, String notes) {
        this.weekDays = WeekDays.valueOf(WeekDays.class,weekDays.toUpperCase());
        this.notes = notes;
    }
    private static Comparator<WeeklyEntries> sortedWeekly() {
        return (e1,e2)-> Integer.compare(e1.weekDays.ordinal(),e2.weekDays.ordinal());
    }

    @Override
    public String toString() {
        return String.format("%s - %s",this.weekDays,this.notes);
    }
}
