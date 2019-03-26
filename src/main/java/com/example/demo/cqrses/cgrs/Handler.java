package com.example.demo.cqrses.cgrs;

public interface Handler<T extends Dispatchable> {

        void handle(T dispatchable);
}
