package com.keax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keax.model.Role;

public interface IRoleRepository  extends JpaRepository<Role, Integer>{

}
