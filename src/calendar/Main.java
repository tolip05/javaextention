package calendar;

public class Main {
    public static void main(String[] args) {
        WeeklyCalendar calendar = new WeeklyCalendar();
        calendar.addWeeklyEntry("Sunday","sport");
        calendar.addWeeklyEntry("Monday","kur golqm");
        calendar.addWeeklyEntry("Tuesday","tenis");

        for (WeeklyEntries s : calendar.getWeeklyScedule()) {
            System.out.println(s);
        }
    }
}
