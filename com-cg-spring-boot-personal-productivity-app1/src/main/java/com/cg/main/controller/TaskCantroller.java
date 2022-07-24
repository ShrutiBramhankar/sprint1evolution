package com.cg.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.main.model.Task;
import com.cg.main.service.TaskService;


@RestController
@RequestMapping("/task")
public class TaskCantroller {
@Autowired
 TaskService ts;

//@PostMapping("/saveTask")
//public Task saveTask(@RequestBody Task t) {
//	//t.setTaskName(t.getTaskName());
	//t.setTasklocation(t.getTasklocation());
//  //  t.setTimeDuration(t.getTimeDuration());
//	return ts.saveTask(t);
//save task only
	@PostMapping("/savetask")
	public Task saveTask(@RequestBody Task t)
	{
		return ts.saveTask(t);
	}

@DeleteMapping("/deletetask/{taskid}")
public String deleteTask(@PathVariable("taskid") int id)
{     
	ts.deleteTask(id);
	return "Task is Successfully deleted";
}


}

