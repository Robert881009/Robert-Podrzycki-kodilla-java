package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    @Override
    public String getMessage() {
        return "Nie ma takiego lotniska";
    }
}
