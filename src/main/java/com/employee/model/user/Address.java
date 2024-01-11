package com.employee.model.user;

import lombok.Data;

@Data
public class Address {
    private Integer addressId;
    private  String dateOfBirth;
    private String street;
    private String city;
    private String zipcode;

}
