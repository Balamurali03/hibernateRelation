package com.project.hibernateRelationship.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hibernateRelationship.Entity.AuthorDetail;

public interface AuthorRepo  extends JpaRepository<AuthorDetail,Integer>{

}
