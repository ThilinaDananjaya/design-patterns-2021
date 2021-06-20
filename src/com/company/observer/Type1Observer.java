package com.company.observer;

//reading the news
public class Type1Observer implements Observer {

    //accept the email address as a constructor
    private String email;

    @Override
    public void notifyObserver(String news) {
        //send an actual email to the observer
        System.out.println("Reading the news: " + news);
    }
}
