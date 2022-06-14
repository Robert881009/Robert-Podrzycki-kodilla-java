package com.kodilla.good.patterns.challenges.order;

public class MailService implements InformationService{
    @Override
    public void informationToUser(User user) {
        System.out.println("Your order is accepted");
    }
}
