package cloudhumans.proportal.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProPostDto {

    @JsonProperty("id")
    private long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private Integer age;

    @JsonProperty("educationLevels")
    private String educationLevels;

    @JsonProperty("pastExperiences")
    private String pastExperiences;

    @JsonProperty("internetTest")
    private Double internetTest;

    @JsonProperty("writingScore")
    private Integer writingScore;

    @JsonProperty("referralCode")
    private String referralCode;
}
