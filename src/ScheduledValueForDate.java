import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class ScheduledValueForDate {
    private static final String[] NASAL_DROPS = {"Left nostril", "Right nostril"};
    private static final String[] ROCK_BONE_PTH = {"Left naval", "Right naval", "Left thigh", "Right thigh"};

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, Month.MARCH, 30);

        LocalDate now = LocalDate.now();
        startDate.datesUntil(now);
        long daysBetween = DAYS.between(startDate, now);
        System.out.println(String.format("Days between %s and %s: %d", startDate, now, daysBetween));

        int nasalDropsIdx = (int)daysBetween % NASAL_DROPS.length;
        int rockBonPTHIdx = (int)daysBetween % ROCK_BONE_PTH.length;

        System.out.println("Nasal Drops: " + NASAL_DROPS[nasalDropsIdx]);
        System.out.println("Rockbon PTH: " + ROCK_BONE_PTH[rockBonPTHIdx]);
    }
}
