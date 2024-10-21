package com.keax.model;
 
import java.io.Serializable;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectId;

    @Column(name = "project_name", nullable = false)
    private String projectName;

    @Column(name = "project_description")
    private String projectDescription;

    @Column(name = "project_start_date", nullable = false)
    private Date projectStartDate;

    @Column(name = "project_end_date", nullable = false)
    private Date projectEndDate;

    @ManyToOne
    @JoinColumn(name = "project_status_id")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "project_manager_id")
    private User manager;
}