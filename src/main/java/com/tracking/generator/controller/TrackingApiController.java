package com.tracking.generator.controller;

import com.tracking.generator.entity.TrackingNumberRequest;
import com.tracking.generator.entity.TrackingNumberResponse;
import com.tracking.generator.service.TrackingApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.ZonedDateTime;

/**
 * REST controller for handling tracking number generation requests.
 * This controller exposes a GET endpoint to generate unique tracking numbers
 * based on customerId, origin/destination countries, weight, and timestamp.
 * It binds business logic to {@link com.tracking.generator.service.TrackingApiService}
 * and ensures validation of all input parameters.
 * Endpoint:</b> {@code GET /next-tracking-number}
 * Sample request: for local testing:
 * <a href=http://localhost:8080/next-tracking-number?origin_country_id=IN&destination_country_id=US&weight=56&created_at=&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBox Logi&customer_slug=redbox-logistics&created_by=Sneha}</a>
 * Returns: a unique tracking number in the format {@code [A-Z0-9]{1,16}} and RFC 3339 timestamp.
 *
 * @author Snehankita C
 * @version 1.0
 * @since 2025-04-11
 */
@RestController
@RequestMapping("/next-tracking-number")
@Validated
public class TrackingApiController {

    @Autowired
    TrackingApiService trackingApiService;
    @GetMapping
    public ResponseEntity<TrackingNumberResponse> getTrackingApi (
            @RequestParam String origin_country_id,
            @RequestParam String destination_country_id,
            @RequestParam Integer weight,
            @RequestParam String created_at,
            @RequestParam String created_by,
            @RequestParam String customer_id,
            @RequestParam String customer_name,
            @RequestParam String customer_slug
    ) throws ParseException {
        TrackingNumberRequest request = new TrackingNumberRequest();
        request.setOriginCountryId(origin_country_id);
        request.setDestinationCountryId(destination_country_id);
        request.setWeight(BigDecimal.valueOf(weight));
        request.setCreatedAt(ZonedDateTime.now());
        request.setCustomerId(customer_id);
        request.setCreatedBy(created_by);
        request.setCustomerName(customer_name);
        request.setCustomerSlug(customer_slug);
        return ResponseEntity.ok(trackingApiService.getTrackingNumber(request));
    }
}
