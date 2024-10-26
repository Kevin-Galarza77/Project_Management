package com.keax.services;

import java.util.List;

import com.keax.model.Comment; 


public interface ICommentService {
	public void insertComment(Comment comment);

	public void updateComment(Comment comment);

	public void deleteComment(int id);

	public List<Comment> listComments();
}
