package com.example.GoogleLoginDemo.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Component;
@Component
public class UserDao {
	
	
	
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	

	public int save(OAuth2User principal) {
		String sql = "insert into userlogin(name,email) values('" + principal.getAttribute("name") + "','" + principal.getAttribute("email") + "')";
		return template.update(sql);
	
	}

}
