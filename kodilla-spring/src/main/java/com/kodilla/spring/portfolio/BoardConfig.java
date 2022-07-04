package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Bean(name="List1")
    public TaskList getToDoList1(){
        return new TaskList();
    }
    @Bean(name="List2")
    public TaskList getInProgressList1(){
        return new TaskList();
    }
    @Bean(name="List3")
    public TaskList getDoneList1(){
        return new TaskList();
    }
    @Bean(name= "List")
    public Board board(){
        return new Board(getToDoList1(),getInProgressList1(),getDoneList1());
    }
}
