package com.employee.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="districts")
public class Districts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public  int districtId;

    public String districtName;

    @Override
    public String toString() {
        return "Districts{" +
                "districtId=" + districtId +
                ", districtName='" + districtName + '\'' +
                '}';
    }
}
