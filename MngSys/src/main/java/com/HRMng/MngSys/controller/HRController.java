package com.HRMng.MngSys.controller;

import com.HRMng.MngSys.entities.Employees;
import com.HRMng.MngSys.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HRController {
    private EmployeeService employeeService;
    @GetMapping("/HRhome")
    public String HRhome(){

        return "I am HR controller";
    }
    //get list of employees
    @GetMapping("/employees")
    public List<Employees> getEmployyees(){


    }

}
