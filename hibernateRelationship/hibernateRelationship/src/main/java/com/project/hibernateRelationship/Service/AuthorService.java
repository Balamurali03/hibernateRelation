package com.project.hibernateRelationship.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hibernateRelationship.Entity.Address;
import com.project.hibernateRelationship.Entity.AuthorDetail;
import com.project.hibernateRelationship.Entity.Book;
import com.project.hibernateRelationship.Repo.AuthorRepo;
import com.project.hibernateRelationship.Repo.Bookrepo;

@Service
public class AuthorService {

	@Autowired 
	private AuthorRepo authorRepo;
	@Autowired Bookrepo bookRepo;
	
	
	public String saveAuthor( AuthorDetail  author)
	{
		 AuthorDetail authorDetail = new AuthorDetail();
		 authorDetail.setAuthorId(author.getAuthorId());
	        authorDetail.setAuthorName(author.getAuthorName());
	        Address address = new Address();
	        address.setAuthor(authorDetail);
	        address.setCity(author.getAddress().getCity());
	        address.setState(author.getAddress().getState());
	        address.setPincode(author.getAddress().getPincode());

	        authorDetail.setAddress(address);
	        
	        List<Book> books = new ArrayList<>();

	        for (Book bookDTO : author.getBooks()) {
	            Book book = new Book();
	            book.setBookName(bookDTO.getBookName());
	            book.setAuthor(authorDetail);
	            books.add(book);
	        }

	        authorDetail.setBooks(books);

		authorRepo.save(authorDetail);
		return "saved";
	}

	
	public AuthorDetail getAuthorWithBooks(int authorId) {
		AuthorDetail authorDetail=authorRepo.findById(authorId).get();
		return authorDetail;
	}

}
