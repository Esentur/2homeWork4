package com.company;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        Producer producer = new Producer(storage);
        Consumer consumer = new Consumer(storage);
        for(int i =0;i<5;i++){
            producer.run();
            consumer.run();
        }
    }
}
