package ru.netology;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener speaker = System.out::println;
        Worker worker = new Worker(listener, speaker);
        worker.start();
    }
}
