package com.example.demo.cqrses.es;

import com.example.demo.cqrses.cgrs.Dispatcher;

public interface EventDispatcher extends Dispatcher<Event> {

    void dispatch(Event dispatchable);

}
