package com.keax.Project_Management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keax.Project_Management.model.Role;
import com.keax.Project_Management.model.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

    public User findByUserEmail(String userEmail);

    public List<User> findByUserFirstName(String firstName);

    public List<User> findByUserLastName(String userLastName);

    public List<User> findByRole(Role role);
    
    public List<User> findByUserStatus(boolean userStatus);
    
    public List<User> findByUserFirstNameContaining(String firstName);
	
}
