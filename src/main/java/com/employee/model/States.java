package com.employee.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="states")
public class States {

    @Id
    @Column(name="state_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer stateId;

    @Column(name="state_name")
    public String stateName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "states_districtId")
    public List<Districts> districts;


    @Override
    public String toString() {
        return "States{" +
                "stateId=" + stateId +
                ", stateName='" + stateName + '\'' +
                '}';
    }
}
