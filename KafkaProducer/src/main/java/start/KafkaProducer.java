package start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer{

    private static final Logger LOG = LoggerFactory.getLogger(KafkaTemplate.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${TopicName}")
    private String topic;

    public void send(String message){
        LOG.info("sending message--->"+message+" to topic---->"+ topic);
        kafkaTemplate.send(topic, message);
    }
}