package com.keax.Project_Management.model;
 
import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "comments")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;

    @Column(name = "comment_content", nullable = false)
    private String commentContent;

    @Column(name = "comment_date", nullable = false)
    private Date commentDate;
    
    @Column(name = "comment_status", nullable = true)
    private boolean commentStatus;

    @ManyToOne
    @JoinColumn(name = "comment_user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "comment_task_id")
    private Task task;
}
