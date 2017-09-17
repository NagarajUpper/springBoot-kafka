package com.capitalone.digitalmessagingsystem.mobilefeedbackboot.reciver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import com.capitalone.digitalmessagingsystem.mobilefeedbackboot.api.FeedBackApi;

public class Receiver {
	@Autowired
	private FeedBackApi feedBackApi;

	  private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	  @KafkaListener(topics = "${kafka.topic}")
	  public void receive(String payload) {
	    LOGGER.info("received payload='{}'", payload);
	    System.out.println("==============Data====:"+payload);
	    feedBackApi.getCpId(payload);
	  }
	}
