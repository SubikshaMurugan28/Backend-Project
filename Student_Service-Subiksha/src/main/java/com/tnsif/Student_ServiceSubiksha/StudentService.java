package com.tnsif.Student_ServiceSubiksha;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;

	//Get the records from the table
	public List<Student> listAll()
	{
		return repo.findAll();
		
	}
	//save the record
	public void save(Student stud)
	{
		repo.save(stud);
	}
	//review the particular record
	public Student get(Integer id)
	{
		return repo.findById(id).get();
		
	}
	//deleting the particular record
	public void delete(Integer id)
	{
		repo.deleteById(id);
		
	}
	//Update the record
	public void update(Student stud)
	{
		repo.save(stud);
	}
}
