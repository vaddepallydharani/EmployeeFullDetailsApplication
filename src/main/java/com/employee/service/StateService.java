package com.employee.service;

import com.employee.model.States;

public interface StateService {


    States getDistrictsByStateId(Integer stateId);
}
