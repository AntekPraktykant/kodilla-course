package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDo")
    TaskList taskList;

    @Bean(name = "toDo")
    public TaskList getToDoList() {
        List<String> toDoList = new ArrayList<>();
        toDoList.add("ToDo");
        return new TaskList(toDoList);
    }

    @Bean (name = "inProgress")
    @Scope("prototype")
    public TaskList getInProgressList() {
        List<String> toDoList = new ArrayList<>();
        toDoList.add("ToDo");
        return new TaskList(toDoList);
    }

    @Bean (name = "done")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }

}
