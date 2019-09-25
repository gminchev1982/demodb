package com.minchev.demodb.controller;


import com.minchev.demodb.db.EmployeeEntity;
import com.minchev.demodb.service.EmployeeService;
import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
       // save ();
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getEmployeeList() {
        long t;
        long f;
        t = System.currentTimeMillis();
        List<EmployeeEntity> list = employeeService.findAll();
        f = System.currentTimeMillis();

       return  list.size() + " / " +  (f-t);
    }


    //@RequestMapping(value = "/save", method = RequestMethod.GET)
    public boolean save () {

        employeeService.save();

        return true;
    }


}
