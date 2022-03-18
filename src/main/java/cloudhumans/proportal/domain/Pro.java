package cloudhumans.proportal.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "pro")
@Builder
public class Pro {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "educationLevels")
    private String educationLevels;

    @ManyToOne
    @JoinColumn(name = "pastExperiences")
    private PastExperiences pastExperiences;

    @ManyToOne
    @JoinColumn(name = "internetTest")
    private InternetTest internetTest;

    @Column(name = "writingScore")
    private Integer writingScore;

    @Column(name = "referralCode")
    private String referralCode;

}
