package edu.inqoo.time;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestTimeManager {
    @Test
    public void should() {
        TimeManager timeManager = new TimeManager();
        LocalDateTime localDateTime = LocalDateTime.now();
        assertEquals(localDateTime.plusYears(12).getYear(), timeManager.addYears(12));
        assertNotEquals(0,timeManager.addYears(12));

        assertEquals(localDateTime.plusMonths(10).getMonth(), timeManager.addMonths(10));
        assertNotEquals(0,timeManager.addMonths(10));

        assertEquals(localDateTime.plusDays(10).getDayOfMonth(), timeManager.addDays(10));
        assertNotEquals(0,timeManager.addDays(10));

        assertEquals(localDateTime.plusMinutes(333).getMinute(),timeManager.addMinutes(333));
        assertNotEquals(0,timeManager.addMinutes(333));

        assertEquals(localDateTime.plusHours(1500).getHour(),timeManager.addHours(1500));
        assertNotEquals(0,timeManager.addHours(1500));

//        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyy - HH:mm:ss")));



    }

}
