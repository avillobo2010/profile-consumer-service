package com.cognizant.messageservice.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.messageservice.data.FseDocument;
import com.cognizant.messageservice.service.FseProfileService;



@Component
public class RabbitMQConsumer {
	

	@Autowired
	FseProfileService fseProfileService;

	@RabbitListener(queues = "${cts.rabbitmq.queue}")
	public void recievedMessage(FseDocument document) {
		System.out.println("Recieved Message From RabbitMQ: " + document.getEmail());
		fseProfileService.updateProfile(document);
		}
}