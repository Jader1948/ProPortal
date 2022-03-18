package cloudhumans.proportal.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "pastExperience")
@Builder
public class PastExperiences {

    @Id
    @Column(name = "idExperience")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "sales")
    private String sales;

    @Column(name = "support")
    private String support;
}

