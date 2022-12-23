package com.Rest.Service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.Rest.Repo.StudentsRepo;
import com.Rest.Service.StudentService;

import com.Rest.model.Students;

@Service
public class StudentServiceimplimatation implements StudentService {

	private StudentsRepo repo;
	

	
	public StudentServiceimplimatation(StudentsRepo repo) {
		this.repo = repo;
	}

	@Override
	public Students saveStudent(Students students) {
		return repo.save(students);// we are just saving in repo
	
}

	@Override
	public List<Students> getAllStudents() {
	// here we are just /****/
		List <Students> students = repo.findAll();
		return students;
	}

	@Override
	public List<Students> findByLastname(String lastname) {
		
	List<Students> students = repo.findByLastname(lastname);
		return students;
	}

//	@Override
//	public Students getByfirstname(String firstname) {
//		Optional<Students> students = repo.findOne(firstname);
//		if(students.isPresent()) {
//			return students.get();
//		}else {
//			throw new ResourceNotFound("Students", "firstname", firstname);
//		}
//	}
	
	
	
	
}