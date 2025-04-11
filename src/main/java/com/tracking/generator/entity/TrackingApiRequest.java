package com.tracking.generator.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TrackingApiRequest {
    private String originCountryId;
    private String destinationCountryId;
    private Integer weight;
    private String createdAt;
    private String createdBy;
    private String customerName;
    private String customerSlug;

}
