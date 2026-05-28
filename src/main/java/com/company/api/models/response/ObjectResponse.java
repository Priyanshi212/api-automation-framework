package com.company.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) // If API adds new fields, test won't break
public class ObjectResponse {
    
    private String id;          // "ff808181932badb6019526fbc7a22f3a"
    private String name;        // "Tanvi"
    private ObjectData data;    // Nested object
    private String createdAt;   // "2026-05-28T15:45:12.345+00:00"
    private String updatedAt;   // Present after PUT/PATCH

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ObjectData {
        private String role;        // "SDET3"
        private String company;     // "YourCompany"
        private Integer experience; // 5
        private Double price;       // 2999.99
        private Integer year;       // 2024
    }
}