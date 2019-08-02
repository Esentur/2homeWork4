package com.company;

public class Consumer extends Thread {
    private Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        System.out.println("Потребитель берет 5 ед. продукции со склада.");
        for(int i = 0;i <5;i++){
            storage.decreaseCounter();
        }

    }
}


