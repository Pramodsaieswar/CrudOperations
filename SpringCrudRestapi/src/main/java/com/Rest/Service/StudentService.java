package com.Rest.Service;

import java.util.List;


import com.Rest.model.Students;


public interface StudentService {

	Students saveStudent(Students students);
	//for getting all we have to use list and pass model class and methodname//
	List<Students>getAllStudents();
	
	List<Students> findByLastname(String lastname);
	
	
}
