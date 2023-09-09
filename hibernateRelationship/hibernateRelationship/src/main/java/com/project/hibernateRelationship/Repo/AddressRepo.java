package com.project.hibernateRelationship.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hibernateRelationship.Entity.Address;

public interface AddressRepo extends JpaRepository<Address,Integer> {

}
