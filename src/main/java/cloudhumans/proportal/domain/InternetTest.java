package cloudhumans.proportal.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "internetTest")
@Builder
public class InternetTest {

    @Id
    @Column(name = "idInternetTest")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "downloadSpeed")
    private String downloadSpeed;

    @Column(name = "uploadSpeed")
    private String uploadSpeed;

}

