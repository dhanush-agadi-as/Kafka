package com.kafka.consumer;

import org.springframework.context.annotation.Bean;
import com.kafka.consumer.consumer.RiderLocation;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class KafkaFunctionStream {

    @Bean
    public Consumer<RiderLocation> consumer() {
        return location -> {
            System.out.println("recived : "+location.getLongitude()+" , "+location.getLatitude()+" , "+location.getRiderId());
        };
    }

    @Bean
    public Consumer<RiderStatus> consumer2() {
        return status -> {
            System.out.println("rider id : "+status.getRiderName()+", "+status.getRiderStatus());
        };
    }




}
