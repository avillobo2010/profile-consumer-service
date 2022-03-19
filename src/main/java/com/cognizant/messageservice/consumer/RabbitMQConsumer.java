package com.cognizant.messageservice.consumer;

import com.cognizant.messageservice.model.FseSkillTracker;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.cognizant.messageservice.service.FseProfileService;


@Component
public class RabbitMQConsumer {
	

	@Autowired
	FseProfileService fseProfileService;

	@RabbitListener(queues = "${cts.rabbitmq.queue}")
	public void recievedProfileMessage(FseSkillTracker fseProfile) {
		System.out.println("Recieved Profile Message From RabbitMQ: " + fseProfile);
		fseProfileService.updateProfile(fseProfile.getFseDocument());
		fseProfileService.updateProfileSkills(fseProfile.getSkillDocumentList());
		}

}