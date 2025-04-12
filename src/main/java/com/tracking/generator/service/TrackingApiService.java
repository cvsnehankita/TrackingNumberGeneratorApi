package com.tracking.generator.service;

import com.tracking.generator.entity.TrackingNumberResponse;
import com.tracking.generator.entity.TrackingNumberRequest;
import com.tracking.generator.repository.TrackingNumberRepository;
import com.tracking.generator.util.TrackingNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class responsible for generating unique tracking numbers
 * based on customer details and timestamp. It also saves every request with the request ID.
 *
 * @author Snehankita C
 * @version 1.0
 * @since 2025-04-11
 */
@Service
public class TrackingApiService {
    @Autowired
    TrackingNumberGenerator trackingNumberGenerator;

    @Autowired
    TrackingNumberRepository repository;
    public void addTrackingRequest(TrackingNumberRequest request){
        repository.save(request);
    }
    public TrackingNumberResponse getTrackingNumber(TrackingNumberRequest request){
        addTrackingRequest(request);
        return new TrackingNumberResponse(generateTrackingNumber(request), request.getCreatedAt());
    }
    private String generateTrackingNumber(TrackingNumberRequest request){
        String baseRequest = request.getOriginCountryId()
                + request.getDestinationCountryId()
                + request.getWeight()
                + request.getCreatedAt()
                + request.getCustomerId()
                + request.getCustomerName()
                + request.getCustomerSlug();
        return trackingNumberGenerator.generateTrackingNumber(baseRequest);
    }
}
