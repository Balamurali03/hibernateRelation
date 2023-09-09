package com.project.hibernateRelationship.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.hibernateRelationship.Entity.AuthorDetail;
import com.project.hibernateRelationship.Service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired 
	private AuthorService authorService;
	
	@PostMapping("/saveAuthor") 
	public ResponseEntity<String> saving(@RequestBody AuthorDetail author)
	{
		String e1=authorService.saveAuthor(author);
		
			return ResponseEntity.status(200).body(e1);
		
		
	}
	@GetMapping("/getAuthor/{id}") 
	public ResponseEntity<AuthorDetail> getAuthor(@PathVariable int id)
	{
		AuthorDetail e1=authorService.getAuthorWithBooks(id);
		
			return ResponseEntity.status(200).body(e1);
		
		
	}


}
