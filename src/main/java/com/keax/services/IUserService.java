package com.keax.services;
 

import java.util.List;

import com.keax.model.User;

public interface IUserService {
	public void insertUser(User User);

	public void updateUser(User User);

	public void deleteUser(int id);

	public List<User> listUser();
}
