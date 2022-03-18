package cloudhumans.proportal.dto;


import cloudhumans.proportal.domain.Pro;
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
public class PastExperienceDto {

    @JsonProperty("idExperience")
    private long id;

    @JsonProperty("sales")
    private String sales;

    @JsonProperty("support")
    private String support;

}
