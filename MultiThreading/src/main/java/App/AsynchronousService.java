package App;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AsynchronousService {

	    @Autowired
	    private TaskExecutor taskExecutor;
		@Autowired
		public SleepTest sleep;
		  List<String> num = new ArrayList<String>();
	    	
	    
	    public void executeAsynchronously() {
	    	num.add("one");
	      	num.add("two");
	      	num.add("three");
	      	num.add("four");
	      	num.add("five");
	      	num.add("six");
	      	num.add("seven");
	      	num.add("eight");
	      	num.add("nine");
	      	for(String a :num) {
	      		 taskExecutor.execute(new Runnable() {
	 	            @Override
	 	            public void run() {

	 	              System.out.println(a);
	 	             System.out.println(Thread.currentThread().getName());
	 	            }
	 	        });
	      	}
	       
	    }

}
