package com.employee.service;

import com.employee.model.States;
import com.employee.repository.StatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateServiceImpl implements StateService{

    @Autowired
    StatesRepository statesRepository;
    @Override
    public States getDistrictsByStateId(Integer stateId) {

        States states = statesRepository.findByStateId(stateId);
        return states;
    }
}
