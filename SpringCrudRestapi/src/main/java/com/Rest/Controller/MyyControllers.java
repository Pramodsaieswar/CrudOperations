package com.Rest.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rest.Service.impl.StudentServiceimplimatation;
import com.Rest.model.Students;

@RestController
@RequestMapping("/api")
public class MyyControllers {
	
	@Autowired
	private StudentServiceimplimatation serviceimplimatation;
	

	//build create Student api//
	
	@PostMapping("/students")
	public ResponseEntity<Students> saveStudent(@RequestBody Students students){
		
		return  new ResponseEntity<Students>(serviceimplimatation.saveStudent(students), HttpStatus.CREATED);
	}
	
//	@GetMapping("/students/{lastname}")
//	public List<Students>getAllStudents(){
//		
//		List<Students> students = studentServiceImpl.getAllStudents();
//		
//		return students;
//	}
	//getbyname//
	
	@GetMapping("/student/{lastname}")
	public List<Students> showLastname(@PathVariable String lastname) {
		
	List<Students> students	= serviceimplimatation.findByLastname(lastname);
	
	return students;
	}
	
	@PutMapping
	public List<Students> updateList(){
		return null;
		
	}
	
}
