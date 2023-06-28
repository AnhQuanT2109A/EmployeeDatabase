package com.example.employeedatabase.service;
import com.example.employeedatabase.entity.employee;

import java.util.List;

public interface EmployeeService {
    public List<employee> findAll();
    public employee findById(int theId);
    public void save(employee theEmployee);
    public void deleteById(int theId);
}
