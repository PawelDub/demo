package com.example.demo.cqrs.cgrs;

public interface Dispatcher<T extends Dispatchable> {

    void dispatch(T dispatchable);
}
