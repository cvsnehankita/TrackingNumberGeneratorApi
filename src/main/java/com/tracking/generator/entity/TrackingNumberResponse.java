package com.tracking.generator.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class TrackingNumberResponse {
    private String tracking_number;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private ZonedDateTime created_at;

    public TrackingNumberResponse(){}
    public TrackingNumberResponse(String tracking_number, ZonedDateTime created_at) {
        this.tracking_number = tracking_number;
        this.created_at = created_at;
    }

    public String getTracking_number() {
        return tracking_number;
    }


    public void setTracking_number(String tracking_number) {
        this.tracking_number = tracking_number;
    }

    public ZonedDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(ZonedDateTime created_at) {
        this.created_at = created_at;
    }
}
