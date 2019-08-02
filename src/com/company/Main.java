package com.company;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        for(int i =0;i<5;i++){
            Producer producer = new Producer(storage);
            producer.run();
            Consumer consumer = new Consumer(storage);
            consumer.run();
        }
    }
}
