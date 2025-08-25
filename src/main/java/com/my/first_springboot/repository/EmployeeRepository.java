package com.my.first_springboot.repository;

import com.my.first_springboot.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods to interact with database
}
