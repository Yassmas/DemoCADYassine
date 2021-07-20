package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.model.Topic;
@Component
public class Repository {
	@Autowired
	JdbcTemplate jdbcTemplate;
			
	
	Topic getAllTopic()
	{
	
		String sql = "SELECT * FROM Topic T INNER JOIN Post P ON P.Topic_ID = T.id";
		

        return jdbcTemplate.queryForObject(sql, null, new TopicRowMapper());	
		
		
		
		
	
}
}
