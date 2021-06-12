package ru.scarlet.spring.mvc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "speedtest")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpeedTest {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    // @OneToMany(cascade = CascadeType.ALL, mappedBy = "OperatorId", fetch = FetchType.LAZY)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="OperatorId")
    private Operator Operator;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="LocationId")
    private Location location;


    @Column(name = "DownloadSpeed")
    private double downloadSpeed;

    @Column(name = "UploadSpeed")
    private double uploadSpeed;

    @Column(name = "Latency")
    private int latency;

    public SpeedTest(Operator operator, Location location, double downloadSpeed, double uploadSpeed, int latency){
        this.downloadSpeed=downloadSpeed;
        this.latency=latency;
        this.uploadSpeed=uploadSpeed;
        this.location=location;
        this.Operator=operator;
    }


}
