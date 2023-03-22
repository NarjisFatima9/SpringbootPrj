package com.HRMng.MngSys.service;

import com.HRMng.MngSys.entities.Employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    List<Employees> list;

    public EmployeeServiceImpl() {
        list= new ArrayList<>();
        list.add(new Employees(1001,"John","Manager","Finance"));
        list.add(new Employees(1002,"fedrick","ITSpecialist","Information Technology"));
        list.add(new Employees(1003,"Abraham","PRO","Human Resource"));


    }

    @Override
    public List<Employees> getEmployyees() {
        return list;
    }
}
