package com.SpringbootRestApi.SpringbootRestApi.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringbootRestApi.SpringbootRestApi.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
