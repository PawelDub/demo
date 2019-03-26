package com.example.demo.cqrses.cgrs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class Bus<T extends Dispatchable, R extends Handler> implements Dispatcher<T> {

    private Map<Class, R> handlers = new HashMap<>();

    @SuppressWarnings("unchecked")
    @Override
    public void dispatch(T dispatchable) {
            System.out.println("1 Bus dispatch, handler: " + dispatchable.getClass().getSimpleName());
        System.out.println("handlers: " + handlers);
        Optional.ofNullable(handlers.get(dispatchable.getClass()))
            .orElseThrow(() -> new RuntimeException("There is no handler for " + dispatchable.getClass().toString()))
            .handle(dispatchable);
            System.out.println("2 Bus dispatch, handler: " + dispatchable.getClass().getSimpleName());
    }

    @Autowired(required = false)
    public void registerHandlers(R[] handlers) {

        for (R handler : handlers) {
            System.out.println("Bus registerHandlers, handler: " + handler.getClass().getSimpleName());
            Class<?> clazz = GenericTypeResolver.resolveTypeArgument(handler.getClass(), Handler.class);
            this.handlers.put(clazz, handler);

        }
    }
}
