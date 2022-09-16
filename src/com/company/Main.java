package com.company;


public class Main {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i = 0; i < 2; i++){
            System.out.println(getName());
        }
    }
}