package com.java.potok.Test;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

    }
}

        class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("My Howe Work");
        }
    }
        }