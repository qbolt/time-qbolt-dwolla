package com.dwolla.timeqbolt.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.Instant;
import java.time.ZonedDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeResponse {

    @NonNull
    private Instant currentTime;

    private ZonedDateTime adjustedTime;

}