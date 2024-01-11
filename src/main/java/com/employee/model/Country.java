package com.employee.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="countries")
@Data
public class Country {

    @Id
    @Column(name="country_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer countryId;

    @Column(name="country_name")
    public String countryName;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "country_stateId")
    public List<States> states;



    @Override
    public String toString() {
        return "Country{" +
                "countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", states=" + states +
                '}';
    }
}
