package com.example.employeedatabase.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employeedatabase.entity.employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<employee, Integer> {
    public List<employee> findAllByOrderByLastNameAsc();
}
