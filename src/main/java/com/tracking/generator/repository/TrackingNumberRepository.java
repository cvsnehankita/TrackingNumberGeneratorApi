package com.tracking.generator.repository;

import com.tracking.generator.entity.TrackingRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingNumberRepository extends JpaRepository<TrackingRequest, Integer> {

}
