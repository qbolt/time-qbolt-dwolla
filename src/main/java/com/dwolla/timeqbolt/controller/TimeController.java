package com.dwolla.timeqbolt.controller;

import com.dwolla.timeqbolt.dto.TimeResponse;
import com.dwolla.timeqbolt.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;

@RestController
@Validated
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping("time")
    public TimeResponse time(@RequestParam(value = "timezone", required = false) ZoneId timezone) {
        return timeService.getTime(timezone);
    }

}
