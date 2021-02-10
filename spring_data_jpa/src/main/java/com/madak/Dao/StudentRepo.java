package com.madak.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.madak.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	List<Student> findByCollege(String college);
	
	
	@Query("from Student where college=?1 order by name")  // jpql query for complex computation
	List<Student> findByCollegeOrder(String college);
	
}
