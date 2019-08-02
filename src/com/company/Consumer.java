package com.company;

public class Consumer {
    public void produce(Storage storage) {
        storage.decreaseCounter();
    }
}
