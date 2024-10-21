package com.keax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.keax.model.UserProject;

public interface IUserProjectRepository  extends JpaRepository<UserProject, Integer> {

}
