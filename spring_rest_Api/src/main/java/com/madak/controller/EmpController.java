package com.madak.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.madak.emprepo.EmpRepository;
import com.madak.model.Employee;

@RestController
public class EmpController {
	
	@Autowired
	private EmpRepository repo;
	
	@GetMapping(path="/emps",produces="application/json")   // content negotiation-- it is optional
	public List<Employee> getEmps() {
	List<Employee> emps=repo.findAll();
		return emps;
		}
	
	@GetMapping(path="/emp/{eid}")
	public Optional<Employee> getEmp(@PathVariable("eid") int eid) {
		Optional<Employee> e=repo.findById(eid);
		return e;
	}
	
	@PostMapping(path="/emp",consumes="application/xml")   // content negotiation---it is optional
	public Employee addEmp( @RequestBody Employee em) {
		repo.save(em);
		return em;
	}
	
	@DeleteMapping(path="/emp/{eid}")
	public String deleteEmp(@PathVariable("eid") int eid) {
//		Employee em=repo.getOne(eid);
//		repo.delete(em);                     
		repo.deleteById(eid);                // there are two ways to delete ,using eid or empl object
		return "emp deleted";
				
	}
	@PutMapping(path="/emp")
	public Employee addOrUpdateEmp(@RequestBody Employee em) {
		repo.save(em);
		return em;
	}
	
	
	
}
