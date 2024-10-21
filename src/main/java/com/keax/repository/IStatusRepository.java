package com.keax.repository;

import java.io.ObjectInputFilter.Status;

import org.springframework.data.jpa.repository.JpaRepository;
 

public interface IStatusRepository extends JpaRepository<Status, Integer> {

}
