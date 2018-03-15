package com.test.multitanancy.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.multitanancy.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
