package com.keax.Project_Management.model;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tasks")
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;

    @Column(name = "task_name", nullable = false)
    private String taskName;

    @Column(name = "task_description")
    private String taskDescription;

    @Column(name = "task_creation_date", nullable = false)
    private Date taskCreationDate;

    @Column(name = "task_due_date", nullable = false)
    private Date taskDueDate;

    @Column(name = "task_priority", nullable = false)
    private int taskPriority;
    
    @Column(name = "task_status", nullable = true)
    private boolean taskStatus;

    @ManyToOne
    @JoinColumn(name = "task_status_id")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "task_project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "task_assigned_to")
    private User assignedTo;
}