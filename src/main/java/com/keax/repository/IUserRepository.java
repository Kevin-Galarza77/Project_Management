package com.keax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keax.model.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
