package com.data.sesson06_javawebservice.repository;

import com.data.sesson06_javawebservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
