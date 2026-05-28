package com.company.api.models.request;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL) // Don't send null fields
public class CreateObjectRequest {
    
    private String name;        // Maps to "name" in JSON
    private ObjectData data;    // Maps to "data" object in JSON

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ObjectData {
        private String role;        // data.role
        private String company;     // data.company  
        private Integer experience; // data.experience
        private Double price;       // data.price - optional
        private Integer year;       // data.year - optional
    }
}