package com.keax.Project_Management.model;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_projects")
public class UserProject implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userProjectId;

    @ManyToOne
    @JoinColumn(name = "user_project_user_id")
    private User user;

    @Column(name = "user_project_status", nullable = true)
    private boolean userProjectStatus;
    
    @ManyToOne
    @JoinColumn(name = "user_project_project_id")
    private Project project;
}
