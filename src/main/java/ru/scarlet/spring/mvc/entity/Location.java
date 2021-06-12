package ru.scarlet.spring.mvc.entity;

import ru.scarlet.spring.mvc.validation.CheckFields;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Table(name = "location_list")
public class Location {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }



    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @CheckFields
//    @NotBlank
//    @NotEmpty
//    @NotNull
    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private  double latitude;

    public Location() {
    }

    public Location(double longitude, double latitude, int type_id) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.type_id = type_id;
    }

    @Column(name = "type_id")
    private int type_id;

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }
}
