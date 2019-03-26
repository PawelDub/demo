package com.example.demo.cqrses.cgrs;

public interface Dispatcher<T extends Dispatchable> {

    void dispatch(T dispatchable);
}
