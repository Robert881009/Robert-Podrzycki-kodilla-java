package com.kodilla.good.patterns.challenges.order;

public class ShoesOrderService implements OrderService{
    @Override
    public boolean order(User user, Product product) {
        System.out.println(user.getName()+ " "+ user.getSurname()+ " your product is: " + product.getName()+" price: "+ product.getPrice());
        return true;
    }
}
