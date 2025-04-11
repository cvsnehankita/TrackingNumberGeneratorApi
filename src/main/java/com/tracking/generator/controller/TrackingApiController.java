package com.tracking.generator.controller;

import com.tracking.generator.entity.TrackingRequest;
import com.tracking.generator.service.TrackingApiService;
import jakarta.validation.constraints.Max;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@RestController
@RequestMapping("/next-tracking-number")
@Validated
public class TrackingApiController {

    @Autowired
    TrackingApiService trackingApiService;
    @GetMapping
    public String getTrackingApi (
            @RequestParam String origin_country_id,
            @RequestParam String destination_country_id,
            @RequestParam Integer weight,
            @RequestParam String created_at,
            @RequestParam String created_by,
            @RequestParam String customer_id,
            @RequestParam String customer_name,
            @RequestParam String customer_slug
    ) throws ParseException {
        TrackingRequest request = new TrackingRequest();
        request.setOriginCountryId(origin_country_id);
        request.setDestinationCountryId(destination_country_id);
        request.setWeight(BigDecimal.valueOf(weight));
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        request.setCreatedAt(ZonedDateTime.now());
        request.setCustomerId(customer_id);
        request.setCreatedBy(created_by);
        request.setCustomerName(customer_name);
        request.setCustomerSlug(customer_slug);
        return trackingApiService.getTrackingNumber(request);
    }
}
