package com.keax.Project_Management.services;
 

import java.util.List;

import com.keax.Project_Management.model.Role;
import com.keax.Project_Management.model.User;

public interface IUserService {
	public void insertUser(User User);

	public void updateUser(User User);

	public void deleteUser(int id);

	public List<User> listUser();
	
    public User findByUserEmail(String userEmail);

    public List<User> findByUserFirstName(String firstName);

    public List<User> findByUserLastName(String userLastName);

    public List<User> findByRole(Role role);
    
    public List<User> findByUserFirstNameContaining(String firstName);
}
