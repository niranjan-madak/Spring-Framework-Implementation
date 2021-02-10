package com.madak.emprepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madak.model.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
