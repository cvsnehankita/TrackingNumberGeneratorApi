package com.tracking.generator.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TrackingRequestDto {
    @NotNull
    @NotBlank
    @Size(max = 2, message = "Country code must be 2 letters ISO 3166-1 alpha-2 format code.")
    private String orgin_country_id;
    @NotNull
    @NotBlank
    @Size(max = 2, message = "Country code must be 2 letters ISO 3166-1 alpha-2 format code.")
    private String destination_country_id;
    @NotNull
    @NotBlank
    private Integer weight;
    @NotNull
    @NotBlank
    private String created_at;
    @NotNull
    @NotBlank
    private String created_by;
    @NotNull
    @NotBlank
    private String customerId;
    @NotNull
    @NotBlank
    private String customer_name;
    @NotNull
    @NotBlank
    private String customer_slug;
}
