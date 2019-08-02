package com.company;

public class Producer extends Thread{
    private Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        System.out.println("Производитель пополняет склад на 5 ед. продукции.");
        for(int i = 0;i <5;i++){
            storage.increaseCounter();
        }

    }
}
