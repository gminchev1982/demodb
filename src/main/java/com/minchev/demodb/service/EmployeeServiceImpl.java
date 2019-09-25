package com.minchev.demodb.service;

import com.minchev.demodb.db.EmployeeEntity;
import com.minchev.demodb.db.EmployeeRepository;
import com.minchev.demodb.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl  implements  EmployeeService{

    private EmployeeEntity employeeEntity;
    private final EmployeeRepository employeeRepository;


    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeEntity = employeeEntity;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Boolean save() {
        for (Integer i=1000; i<100000; i++) {
            employeeEntity = new EmployeeEntity(i+2, "Pesho", "Atanasov",  i);
            employeeRepository.save(employeeEntity);
        }

        return true;
    }

    @Override
    public List<EmployeeEntity> findAll() {
        return employeeRepository.findBySalary(300);
    }
}
