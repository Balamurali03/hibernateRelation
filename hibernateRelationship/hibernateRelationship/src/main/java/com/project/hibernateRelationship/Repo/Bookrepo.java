package com.project.hibernateRelationship.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.hibernateRelationship.Entity.Book;

public interface Bookrepo extends JpaRepository<Book,Integer> {
	
	@Query(value = "SELECT * FROM book  WHERE author_id = :authorId", nativeQuery = true)
    List<Book> findBooksByAuthorId(int authorId);

}
