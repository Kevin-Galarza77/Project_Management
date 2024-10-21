package com.keax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.keax.model.Comment;
import com.keax.repository.ICommentRepository;
import com.keax.services.ICommentService;

public class CommentServiceImp implements ICommentService {
	
	@Autowired
	private ICommentRepository commentRepository;

	@Override
	public void insertComment(Comment comment) {
		try {
			commentRepository.save(comment);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateComment(Comment comment) {
		try {
			commentRepository.save(comment);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteComment(int id) {
		try {
			commentRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Comment> listComments() {
		try {
			return commentRepository.findAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
