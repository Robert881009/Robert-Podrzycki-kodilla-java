package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testConditional(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        boolean listExist = context.containsBean("List");
        //Then
        System.out.println("Contener exists: " + listExist);
    }
    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().addTask("Task1");
        board.getInProgressList().addTask("Task2");
        board.getToDoList().addTask("Task3");
        //Then
        System.out.println(board.getDoneList());
        System.out.println(board.getInProgressList());
        System.out.println(board.getToDoList());
    }
}
