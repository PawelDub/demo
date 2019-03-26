package com.example.demo.cqrses.es;

import com.example.demo.cqrses.cgrs.Bus;
import org.springframework.stereotype.Component;

@Component
public class EventBus extends Bus<Event, EventHandler<? extends Event>> implements EventDispatcher{

}
