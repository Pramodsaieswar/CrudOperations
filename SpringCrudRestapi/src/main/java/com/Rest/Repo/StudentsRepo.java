package com.Rest.Repo;

import java.util.List;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rest.model.Students;
@Repository
public interface StudentsRepo extends JpaRepository<Students, Long> {

	List<Students> findByLastname(String lastname);
	

}
