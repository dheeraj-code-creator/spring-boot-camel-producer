package com.example.springbootcamel.producer.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqProducer extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:actime-mq-timer?period=5000")
                .transform().constant("First Active-Mq-Message")
                .to("activemq:my-active-mq-queue");

    }
}
