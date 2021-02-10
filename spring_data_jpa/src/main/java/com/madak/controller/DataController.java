package com.madak.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.madak.Dao.StudentRepo;
import com.madak.model.Student;

@Controller
public class DataController {
	
	@Autowired
	private StudentRepo repo;
	
	@RequestMapping("/add")
	@ResponseBody
	public String addStud(Student stud) {
		
		repo.save(stud);
		
		return "Data saved successfully";
		
	}
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<Student> getallStud() {
		List<Student> studs=repo.findAll();
		return studs;
	}
	
	@RequestMapping("/getone/{id}")
	@ResponseBody
	public  Optional<Student> getOne(@PathVariable("id") int id) {
		
		return repo.findById(id);
	 
	}
	
	@RequestMapping("del/{id}")
	@ResponseBody
	public String deleteStud(@PathVariable("id") int id) {
		
		repo.deleteById(id);
		return "data deleted";
	}
  
	@RequestMapping("/getbycoll")
	@ResponseBody
  public List<Student> getbycoll() {
	  
	 List<Student> s= repo.findByCollege("bbdit");
	 
	 return s;
  }
	@RequestMapping("/getbyord")
	@ResponseBody
  public List<Student> getbyorder() {
	  
	 List<Student> s= repo.findByCollegeOrder("bbdit");
	 
	 return s;
  }


}
