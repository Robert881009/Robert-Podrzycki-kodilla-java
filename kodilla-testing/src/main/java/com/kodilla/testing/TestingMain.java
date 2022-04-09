package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int result1 = calculator.addition(200,100);
        int result2 = calculator.subtraction(300,100);

        if (result1>0 && result2>0){
            System.out.println("test OK");
        }else {
            System.out.println("Error");
        }
    }
}

