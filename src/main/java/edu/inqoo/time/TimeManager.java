package edu.inqoo.time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TimeManager {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyy - HH:mm:ss");

    public int addYears(int years) {
        LocalDateTime thisYears = LocalDateTime.now();
        return thisYears.plusYears(years).getYear();
    }

    public Month addMonths(int months) {
        LocalDateTime thisMonths = LocalDateTime.now();
        return thisMonths.plusMonths(months).getMonth();

    }

    public int addDays(int days) {
        LocalDateTime thisDays = LocalDateTime.now();
        return thisDays.plusDays(days).getDayOfMonth();

    }

    public int addHours(int hours) {
        LocalDateTime thisHours = LocalDateTime.now();
        return thisHours.plusHours(hours).getHour();

    }

    public int addMinutes(int minutes) {
        LocalDateTime thisMinutes = LocalDateTime.now();
        return thisMinutes.plusMinutes(minutes).getMinute();

    }


}
