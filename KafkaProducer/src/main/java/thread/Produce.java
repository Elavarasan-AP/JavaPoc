package thread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import start.KafkaProducer;

@SpringBootApplication
public class Produce  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Produce.class, args);
	}
	
	 @Autowired
	    private KafkaProducer sender;

	    @Override
	    public void run(String... strings) throws Exception {
//	        sender.send("Spring Kafka Producer and Consumer Example");

	    }
	
}
