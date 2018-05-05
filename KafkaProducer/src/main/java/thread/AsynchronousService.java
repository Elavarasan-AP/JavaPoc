package thread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;

public class AsynchronousService {

	    @Autowired
	    private TaskExecutor taskExecutor;
	    
	    public void executeAsynchronously() {
	        taskExecutor.execute(new Runnable() {
	            @Override
	            public void run() {
	              
	            }
	        });
	    }

}
