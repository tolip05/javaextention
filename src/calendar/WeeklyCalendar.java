package calendar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyCalendar {
    private List<WeeklyEntries> entries;

    public WeeklyCalendar() {
        this.entries = new ArrayList<>();
    }
    public void addWeeklyEntry(String weekday,String notes){
        WeeklyEntries entry = new WeeklyEntries(weekday,notes);
        this.entries.add(entry);
    }
    public Iterable<WeeklyEntries> getWeeklyScedule(){
        Collections.sort(this.entries,WeeklyEntries.BY_WEEKDAY);
        return this.entries;
    }
}
