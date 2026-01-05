
// Write a Java program to use EnumSet and EnumMap with an enum type.
// Demonstrate how EnumSet can be used to store a set of enum values and
// EnumMap for mapping enum keys to values.
import java.util.*;

enum Day {
    MON, TUE, WED, THU, FRI
}

public class Program7 {
    public static void main(String[] args) {

        EnumSet<Day> workingDays = EnumSet.of(Day.MON, Day.TUE, Day.WED);
        System.out.println("EnumSet: " + workingDays);

        EnumMap<Day, String> schedule = new EnumMap<>(Day.class);
        schedule.put(Day.MON, "Meeting");
        schedule.put(Day.TUE, "Coding");

        System.out.println("EnumMap: " + schedule);
    }
}
