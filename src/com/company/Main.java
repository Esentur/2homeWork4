package com.company;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        for(int i =0;i<5;i++){
            MyThread produceThread = new MyThread(storage);
            produceThread.run();
            MyThread2 consumeThread = new MyThread2(storage);
            consumeThread.run();

        }
    }
}
