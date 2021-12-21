package com.or;

public class CountDownThread extends Thread{

    private final int rate;
    private int counter;

    public CountDownThread(int rate, int counter) {
        this.rate = rate;
        this.counter = counter;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + ": " + counter);
            counter--;
            try {
                sleep(rate);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
