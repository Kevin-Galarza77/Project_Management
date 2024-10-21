package com.keax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.keax.model.Task;

public interface ITaaskRepository extends JpaRepository<Task, Integer> {

}
