package cloudhumans.proportal.dto;


import cloudhumans.proportal.domain.InternetTest;
import cloudhumans.proportal.domain.PastExperiences;
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
    private PastExperiences pastExperiences;

    @JsonProperty("internetTest")
    private InternetTest internetTest;

    @JsonProperty("writingScore")
    private Double writingScore;

    @JsonProperty("referralCode")
    private Integer referralCode;
}
