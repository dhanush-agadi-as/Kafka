package com.kafka.producer.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
import java.util.function.Supplier;

@Configuration
public class KafkaProducerStream {

    Random random = new Random();

    @Bean
    public Supplier<RiderLocation> sendRiderLocation(){

        return () -> {
            String rider = "rider" + random.nextInt(10);
            RiderLocation location = new RiderLocation(rider, 28.9,89.2);
            System.out.println("Sending Rider location: " + location.getRiderId());
            return location;
        };
    }

    @Bean
    public Supplier<RiderStatus> sendRiderStatus(){
        return () -> {
            String rider = "rider" + random.nextInt(10);
            String status = random.nextBoolean() ? "ride started" : "ride ended";
            System.out.println("Sending Rider status: " + status);
            return new RiderStatus(rider, status);
        };
    }



}
