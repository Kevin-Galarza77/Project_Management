package com.keax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keax.model.Comment;

 

public interface ICommentRepository extends JpaRepository<Comment, Integer> {

}
