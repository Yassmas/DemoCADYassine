package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Topic;

@RestController

public class testController {
@Autowired
  Repository repository;
  
  
	  @GetMapping("/getInformation")
	  Topic getInformation() {
	Topic topic = repository.getAllTopic();    
	    return topic;
	
	  }

	}

