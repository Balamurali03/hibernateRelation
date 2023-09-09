package com.project.hibernateRelationship.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hibernateRelationship.Repo.Bookrepo;

@Service
public class BookService {

	
	@Autowired
	private Bookrepo bookrepo;
}
