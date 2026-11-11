//package com.kafka.consumer.consumer;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class KafkaConsumer {
//
////    @KafkaListener(topics = "topic1", groupId = "group1")
////    public void listen(String message){
////        System.out.println("recived message" + message);
////    }
//
//    @KafkaListener(topics = "topic3", groupId = "group1")
//    public void listenRiderLocation(RiderLocation riderLocation){
//        System.out.println("Recived riderId" + riderLocation.getRiderId() + " latitude " + riderLocation.getLatitude() + " longitude " + riderLocation.getLongitude());
//    }
//
//}
