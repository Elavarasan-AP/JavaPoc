package test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaListeneer {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaListeneer.class);

	@KafkaListener(topics = "${TopicName}")
	public void listen(@Payload String message) {
		LOG.info("received message--->"+ message);
	}

}
