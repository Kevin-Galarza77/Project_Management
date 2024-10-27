package com.keax.Project_Management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.keax.Project_Management.model.Comment;
import com.keax.Project_Management.model.Task;
import com.keax.Project_Management.model.User;

import java.util.Date;

public interface ICommentRepository extends JpaRepository<Comment, Integer> {
	public List<Comment> findByTask(Task task);

	public List<Comment> findByUser(User user);

	public List<Comment> findByCommentDate(Date commentDate);

	@Query("SELECT c FROM Comment c WHERE c.user.userId = ?1 AND c.commentDate = ?2")
	List<Comment> findByUserAndDate(int userId, Date date);

	@Query("SELECT c FROM Comment c WHERE c.task.taskId = ?1 AND c.commentDate = ?2")
	List<Comment> findByTaskAndDate(int taskId, Date date);
}
