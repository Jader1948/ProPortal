package cloudhumans.proportal.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InternetTestDto {

    @JsonProperty("idInternetTest")
    private long id;

    @JsonProperty("downloadSpeed")
    private String downloadSpeed;

    @JsonProperty("uploadSpeed")
    private String uploadSpeed;

}
