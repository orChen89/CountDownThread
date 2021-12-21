package com.or;

public class Main {

    public static void main(String[] args) {

        Thread count1 = new CountDownThread(5000, 10);
        Thread count2 = new CountDownThread(2000, 30);

        count1.start();
        count2.start();

    }
}
