package com.employee.service;

import com.employee.model.Country;
import com.employee.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    CountryRepository countryRepository;
    @Override
    public Country saveCountries(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public List<Country> getAllCountriesAndStates() {
        return countryRepository.findAll();
    }

    @Override
    public Country getByCountryId(Integer countryId) {
        return countryRepository.findById(countryId).get();
    }

    @Override
    public Country updatingStates(Country country) {
        return countryRepository.save(country);
    }

   /* @Override
    public Country getByStateId(Integer stateId) {
        Country country = countryRepository.getByStateId(stateId);


        return countryRepository.findByStateId(stateId);
    }*/


}
