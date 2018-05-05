package App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Start implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Start.class, args);
	}

	@Autowired
	public AsynchronousService AsynchronousService;
	
	@Autowired
	public SleepTest sleep;

	@Override
	public void run(String... args) throws Exception {
		AsynchronousService.executeAsynchronously();
	}

}
