package com.dwolla.timeqbolt.service;

import com.dwolla.timeqbolt.dto.TimeResponse;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Service
public class TimeService {
    public TimeResponse getTime(ZoneId timezone) {

        var utcTime = Instant.now();
        var timeResponse = new TimeResponse(utcTime);

        // If timezone param is present, set adjusted time based on utcTime and given timezone
        if (timezone != null) {
            var adjustedTime = ZonedDateTime.ofInstant(utcTime, timezone);
            timeResponse.setAdjustedTime(adjustedTime);
        }

        return timeResponse;
    }
}
