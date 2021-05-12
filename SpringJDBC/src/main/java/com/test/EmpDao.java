package com.test;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao {
	
	public JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void save(Employee emp)
	{
		String sql = "insert into empja4 values('"+emp.getName()+"','"+emp.getCmp()+"','"+emp.getSalary()+"')";
		
		jdbcTemplate.execute(sql);
	}
	
	public void update(Employee emp)
	{
		String sql = "update empja4 set name = '"+emp.getName()+"', cmp = '"+emp.getCmp()+"' where salary = '"+emp.getSalary()+"'";
		
		jdbcTemplate.execute(sql);
	}

}
