import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolTest {
	
	ExecutorService executor = Executors.newFixedThreadPool(3); // The pool size is 3
	
	public void start(){
		while(true)
			executor.execute(new ThreadPools());
	}
	
	
}
