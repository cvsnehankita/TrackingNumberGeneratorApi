package com.tracking.generator.service;

import com.tracking.generator.entity.TrackingRequest;
import com.tracking.generator.repository.TrackingNumberRepository;
import com.tracking.generator.util.TrackingNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TrackingApiService {
    @Autowired
    TrackingNumberGenerator trackingNumberGenerator;

    @Autowired
    TrackingNumberRepository repository;
    public String addTrackingRequest(TrackingRequest request){
        repository.save(request);
        return "Tracking request saved successfully";
    }
    public String getTrackingNumber(TrackingRequest request){
        addTrackingRequest(request);
        return "tracking_number:" + generateTrackingNumber(request);
    }
    private String generateTrackingNumber(TrackingRequest request){
        String baseRequest = request.getOriginCountryId()
                + request.getDestinationCountryId()
                + request.getWeight()
                + request.getCreatedAt()
                + request.getCustomerId()
                + request.getCustomerSlug();
        return trackingNumberGenerator.generateTrackingNumber(baseRequest);
    }
}
