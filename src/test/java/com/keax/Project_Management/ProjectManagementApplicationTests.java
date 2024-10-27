
package com.keax.Project_Management;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.keax.Project_Management.model.Project;
import com.keax.Project_Management.model.Role;
import com.keax.Project_Management.model.Status;
import com.keax.Project_Management.model.User;
import com.keax.Project_Management.services.IProjectService;
import com.keax.Project_Management.services.IRoleService;
import com.keax.Project_Management.services.IStatusService;
import com.keax.Project_Management.services.IUserService;

@SpringBootTest
class ProjectManagementApplicationTests {

	@Autowired
	IRoleService roleService;

	@Autowired
	IUserService userService;

	@Autowired
	IStatusService statusService;

	@Autowired
	IProjectService projectService;

	@Test
	void contextLoads() {

		Role role = new Role();
		role.setRoleName("ADMINISTRADOR");
		role.setRoleStatus(true);
		roleService.insertRole(role);
 
		User user = new User(); 
		user.setUserFirstName("Kevin");
		user.setUserLastName("Galarza");
		user.setUserEmail("jimenezkev1040@gmail.com");
		user.setUserPassword("123123123");
		user.setUserStatus(true);
		user.setRole(role);
		userService.insertUser(user);

		Status status = new Status(); 
		status.setStatusName("PENDIENTE");
		status.setStatusStatus(true);
		statusService.insertStatus(status);

		Project project = new Project();
		project.setProjectName("TEST");
		project.setProjectDescription("PROYECTO DE PRUEBA");
		project.setProjectStartDate(new Date(System.currentTimeMillis()));
		project.setProjectEndDate(new Date(System.currentTimeMillis()));
		project.setStatus(status);
		project.setProjectStatus(true);
		project.setManager(user);

		projectService.insertProject(project);

		List<Project> s1 = projectService.listProject();
		System.out.println("<<<<<<<<<<<<<<<<PROYECTOS POR NOMBRE>>>>>>>>>>>>>>>>>>");

		for (Project project2 : s1) {
			System.out.println(project2.getProjectName());
		}

		s1 = projectService.findByStatus(status);
		System.out.println("<<<<<<<<<<<<<<<<PROYECTOS POR ESTADO>>>>>>>>>>>>>>>>>>");

		for (Project project2 : s1) {
			System.out.println(project2.getProjectName() + " / " +  project2.getStatus().getStatusName());
		}
		
	    LocalDate yesterdayLocalDate = LocalDate.now().minusDays(1);
	    Date yesterday = Date.valueOf(yesterdayLocalDate);

		s1 = projectService.findByProjectStartDateAfter(yesterday);
		System.out.println("<<<<<<<<<<<<<<<<PROYECTOS POR FECHA DE INICIO>>>>>>>>>>>>>>>>>>");
		
		for (Project project2 : s1) {
			System.out.println(project2.getProjectName()+ " / " + project2.getProjectStartDate());
		}
 
		s1 = projectService.findByManager(user);
		System.out.println("<<<<<<<<<<<<<<<<PROYECTOS POR MANAGER>>>>>>>>>>>>>>>>>>");

		for (Project project2 : s1) {
			System.out.println(project2.getProjectName() + " / " + project2.getManager().getUserFirstName()+ " " + project2.getManager().getUserLastName());
		}

		s1 = projectService.findByStatusAndManager(status, user);
		System.out.println("<<<<<<<<<<<<<<<<PROYECTOS POR MANAGER Y ESTADO>>>>>>>>>>>>>>>>>>");

		for (Project project2 : s1) {
			System.out.println(project2.getProjectName() + " / " +  project2.getManager().getUserFirstName() + " "+ project2.getManager().getUserLastName()+ " / " + project2.getStatus().getStatusName());
		} 

	}

}
