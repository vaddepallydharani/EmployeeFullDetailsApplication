package com.employee.service;

import com.employee.model.Country;

import java.util.List;

public interface CountryService {

    public Country saveCountries(Country country);

    List<Country> getAllCountriesAndStates();

    Country getByCountryId(Integer countryId);


    Country updatingStates(Country country);


}
