package com.kodilla.exception.test;

public class ExceptionHandling {
    public String probablyIWillThrowException(double x, double y) throws Exception {
        try {
            if (x >= 2 || x < 1 || y == 1.5){
                throw new Exception();
            }
        }catch (Exception e){
            throw  new Exception();
        }finally {
            System.out.println("I am gonna be here... always!");
        }
        return "Done!";
    }
}



