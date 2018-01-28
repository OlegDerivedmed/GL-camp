package com.h2springexample.demotest.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int capaciti;
    private int FLIGHTRANGE;
    private int CARRYINGCAPACITI;
    private int FUELCONSUMPTION;

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capaciti=" + capaciti +
                ", flightRange=" + FLIGHTRANGE +
                ", CARRYINGCAPACITI=" + CARRYINGCAPACITI +
                '}';
    }
}
