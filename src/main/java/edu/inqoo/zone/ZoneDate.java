package edu.inqoo.zone;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDate {


    public void ZoneChanger(int timeFlight) {
        ZonedDateTime travelTime = ZonedDateTime.now().plusHours(timeFlight);
        ZonedDateTime arrivalTime = ZonedDateTime.ofInstant(travelTime.toInstant(), ZoneId.of("Australia/Sydney"));
        System.out.println(arrivalTime);


    }

}
