package com.example.demo;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Post;
import com.example.demo.model.Topic;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TopicRowMapper implements RowMapper<Topic> {

    @Override
    public Topic mapRow(ResultSet rs, int rowNum) throws SQLException {

        Topic topic = new Topic();
        topic.setId(rs.getInt("id"));
        topic.setTitle(rs.getString("title"));
   
        Post post = new Post();
        post.setAuthor(rs.getString("author"));
        post.setContent(rs.getString("content"));
        post.setDate(rs.getDate("date"));
    topic.getListPost().add(post);
        return topic;

    }
}