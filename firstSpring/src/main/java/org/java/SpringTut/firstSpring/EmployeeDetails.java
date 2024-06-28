package org.java.SpringTut.firstSpring;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDetails {

	private JdbcTemplate jdbc;
	
	public void setJdbcTemplate(JdbcTemplate jdbc)
	{
		this.jdbc=jdbc;
	}
	public int saveEmployee(Employee e){  
		String query = "INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)";
        return jdbc.update(query, e.getId(), e.getName(), e.getSalary());
	}  
	
	
}
