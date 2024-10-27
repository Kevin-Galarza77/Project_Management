package com.keax.Project_Management.model;

import java.io.Serializable;
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
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(name = "user_first_name", nullable = false)
	private String userFirstName;

	@Column(name = "user_last_name", nullable = false)
	private String userLastName;

	@Column(name = "user_email", nullable = false)
	private String userEmail;

	@Column(name = "user_password", nullable = false)
	private String userPassword;

	@Column(name = "user_status", nullable = true)
	private boolean userStatus;

	@ManyToOne
	@JoinColumn(name = "user_role_id")
	private Role role;
}