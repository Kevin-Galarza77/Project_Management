package com.keax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.keax.model.Project;

public interface IProjectRepository extends JpaRepository<Project, Integer> {

}
