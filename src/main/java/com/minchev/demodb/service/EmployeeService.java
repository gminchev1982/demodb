package com.minchev.demodb.service;

import com.minchev.demodb.db.EmployeeEntity;
import com.minchev.demodb.model.EmployeeModel;

import java.util.List;

public interface EmployeeService {

    Boolean save();
    //LabServiceEditModel edit(LabServiceEditModel labServiceEditModel);
    List<EmployeeEntity> findAll();
}
