package com.example.demo.cqrses.es;

import com.example.demo.cqrses.cgrs.Handler;

public interface EventHandler<T extends Event> extends Handler<T> {

    void handle(T dispatchable);

}
