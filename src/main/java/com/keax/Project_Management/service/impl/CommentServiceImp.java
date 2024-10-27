package com.keax.Project_Management.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.keax.Project_Management.model.Comment;
import com.keax.Project_Management.model.Task;
import com.keax.Project_Management.model.User;
import com.keax.Project_Management.repository.ICommentRepository;
import com.keax.Project_Management.services.ICommentService;

@Service
@Component
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

	@Override
	public List<Comment> findByTask(Task task) {
		try {
			return commentRepository.findByTask(task);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Comment> findByUser(User user) {
		try {
			return commentRepository.findByUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Comment> findByCommentDate(Date commentDate) {
		try {
			return commentRepository.findByCommentDate(commentDate);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Comment> findByUserAndDate(int userId, Date date) {
		try {
			return commentRepository.findByUserAndDate(userId, date);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Comment> findByTaskAndDate(int taskId, Date date) {
		try {
			return commentRepository.findByTaskAndDate(taskId, date);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
