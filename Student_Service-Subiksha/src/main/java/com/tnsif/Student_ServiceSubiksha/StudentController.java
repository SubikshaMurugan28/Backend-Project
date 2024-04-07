package com.tnsif.Student_ServiceSubiksha;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService stud;
	@GetMapping("/studentservice")
	public List<Student> list();
	{
		return stud.listAll();
	}
	@PostMapping("/studentservice")
	public void add(@RequestBody Student stud1)
	{
		stud.save(stud1);
	}
	@GetMapping("/studentservice/{id}")
	public ResponseEntity<Student> get(@PathVariable Integer id)
	{
		try
		{
			Student s=stud.get(id);
			return new ResponseEntity<Student>(s,HttpStatus.OK);
		}
		

		catch(NoResultException e)
		{
			return new ResponseEntity<Student>(s,HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/studentservice/{id}")
	public void delete(@PathVariable Integer id)
	{
		stud.delete(id);
	}
	@PutMapping("/studentservice/{id}")
	public ResponseEntity<Student> update(@PathVariable Integer id, @RequestBody Student update_s)
	{
		try
		{
			Student exist_s=stud.get(id);
			exist_s.setName(update_s.getName());
			exist_s.setAddress(update_s.getAddress());
			stud.update(exist_s);
			return new ResponseEntity<Student>(exist_s,HttpStatus.OK);
		}
		

		catch(NoResultException e )
		{
			return new ResponseEntity<Student>(exist_s,HttpStatus.NOT_FOUND);
		}
	}

	
}

