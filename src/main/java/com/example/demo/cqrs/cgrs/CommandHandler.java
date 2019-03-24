package com.example.demo.cqrs.cgrs;

public interface CommandHandler<T extends Command> extends Handler<T> {

}
