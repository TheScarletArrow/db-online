package ru.scarlet.spring.mvc.entity;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
   private int id;

    @Column(name = "location_id")
    private int location_id;

    @Column(name = "value")
    private double value;

    public Reviews() {
    }

    public Reviews(int location_id, double value, String comment) {
        this.location_id = location_id;
        this.value = value;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Column(name = "comment")
    private String comment;
}
