//package com.kafka.producer.controller;
//
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/producer")
//public class KafkaProducer {
//
//    private final KafkaTemplate<String, RiderLocation> kafkaTemplate;
//
//    public KafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    @PostMapping("/send")
//    public String sendMessage(@RequestParam String message){
//        RiderLocation riderLocation = new RiderLocation("rider 123",28.1,77.2);
//        kafkaTemplate.send("topic3", riderLocation);
//        return "message sent" + riderLocation.getRiderId();
//    }
//
//
//
//
//}
