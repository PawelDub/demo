package com.example.demo.cqrses.cgrs;

import org.springframework.stereotype.Component;

@Component
public class CommandBus extends Bus<Command, CommandHandler<? extends Command>> implements CommandDispatcher {

    public CommandBus() {
        System.out.println("CommandBus");
    }
}
