package com.employee.Controller;

import com.employee.model.Country;
import com.employee.model.States;
import com.employee.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/country-state")
@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    @PostMapping("/save")
    public Country saveCountries(@RequestBody Country country){
        return countryService.saveCountries(country);
    }

    @GetMapping("/fetch-all")
    public ResponseEntity<List<Country>> getAllCountriesAndStates() {

        List<Country> countries = countryService.getAllCountriesAndStates();

        return ResponseEntity.status(HttpStatus.OK).body(countries);
    }

    @GetMapping("/get-by-country-id")
    public Country getByCountryId(@RequestParam Integer countryId){
        return countryService.getByCountryId(countryId);
    }

    @PutMapping("/updating-anything")
    public Country updatingStates(@RequestBody Country country){
        return countryService.updatingStates(country);
    }







}
