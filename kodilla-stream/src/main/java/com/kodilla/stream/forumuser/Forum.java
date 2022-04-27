package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum(){
    usersList.add(new ForumUser(1, "Marek", 'M', LocalDate.of(1983,9,25),50));
    usersList.add(new ForumUser(2,"Marta",'F',LocalDate.of(1999,6,18),89));
    usersList.add(new ForumUser(3,"Marcin",'M',LocalDate.of(2005,12,6),43));
    usersList.add(new ForumUser(4,"Przemek",'M',LocalDate.of(2000,5,24),0));
    usersList.add(new ForumUser(5,"Iwona",'F',LocalDate.of(1994,7,12),78));
    usersList.add(new ForumUser(6,"Mariusz",'M',LocalDate.of(2001,2,28),33));

    }
    public List<ForumUser> getUserList(){

        return new ArrayList<>(usersList);
    }






}
