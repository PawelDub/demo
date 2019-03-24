package com.example.demo.cqrs.cgrs;

public interface CommandDispatcher extends Dispatcher<Command> {

    void dispatch(Command command);
}
