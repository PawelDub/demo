package com.example.demo.cqrses.cgrs;

public interface CommandDispatcher extends Dispatcher<Command> {

    void dispatch(Command command);
}
