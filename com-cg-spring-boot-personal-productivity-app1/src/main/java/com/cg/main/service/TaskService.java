package com.cg.main.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.main.model.Task;
import com.cg.main.repository.TaskRepository;

@Service
public class TaskService {

	
//	
	@Autowired
   TaskRepository tr;
	

public Task saveTask(Task t) {
//		
	return tr.save(t);
	}
//
//	
	public void deleteTask(int id)
	{
		tr.deleteById(id);
//		
//		
	}
//
}
//
//
//
