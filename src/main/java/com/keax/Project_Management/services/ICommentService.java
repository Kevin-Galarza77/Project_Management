package com.keax.Project_Management.services;

import java.util.Date;
import java.util.List;

import com.keax.Project_Management.model.Comment;
import com.keax.Project_Management.model.Task;
import com.keax.Project_Management.model.User; 


public interface ICommentService {
	public void insertComment(Comment comment);

	public void updateComment(Comment comment);

	public void deleteComment(int id);

	public List<Comment> listComments();
	
	public List<Comment> findByTask(Task task);

	public List<Comment> findByUser(User user);

	public List<Comment> findByCommentDate(Date commentDate);
 
	List<Comment> findByUserAndDate(int userId, Date date);
 
	List<Comment> findByTaskAndDate(int taskId, Date date);
}
