package com.tracking.generator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Data
@Getter
@Setter
public class TrackingRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Getter
    @Setter
    private String originCountryId;
    @Getter
    @Setter
    private String destinationCountryId;
    @Setter
    @Getter
    private Integer weight;
    @Getter
    @Setter
    private Date createdAt;
    @Setter
    @Getter
    private String createdBy;
    @Setter
    @Getter
    private String customerId;
    @Setter
    @Getter
    private String customerName;
    @Setter
    @Getter
    private String customerSlug;
    public TrackingRequest(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginCountryId() {
        return originCountryId;
    }

    public void setOriginCountryId(String originCountryId) {
        this.originCountryId = originCountryId;
    }

    public String getDestinationCountryId() {
        return destinationCountryId;
    }

    public void setDestinationCountryId(String destinationCountryId) {
        this.destinationCountryId = destinationCountryId;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSlug() {
        return customerSlug;
    }

    public void setCustomerSlug(String customerSlug) {
        this.customerSlug = customerSlug;
    }
}
