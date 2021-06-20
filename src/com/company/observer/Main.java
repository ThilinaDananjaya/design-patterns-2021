package com.company.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        //publisher -> Subject
        //subscriber -> Observer

        Observer observer1 = new Type1Observer();
        Observer observer2 = new Type1Observer();
        Observer observer3 = new Type2Observer();

        Subject subject = new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);

        subject.notifyObservers("Curfew will be imposed today!");

        Thread.sleep(10000); //wait for 10 seconds
        System.out.println("=========================");

        subject.notifyObservers("Reversed: Curfew will not be imposed today!");

        Thread.sleep(5000); //wait for 5 seconds

        subject.unsubscribe(observer2);

        Thread.sleep(5000); //wait for 5 seconds
        System.out.println("=========================");

        subject.notifyObservers("Fuel prices gone up!");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String news;

        while (true) {
            System.out.println("Enter news:");
            news = bufferedReader.readLine();
            if (news.isEmpty()) {
                break;
            }
            subject.notifyObservers(news);
            System.out.println("=========================");
        }

    }

}
