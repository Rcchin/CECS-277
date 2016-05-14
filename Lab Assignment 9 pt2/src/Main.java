import java.util.concurrent.*;


public class Main {
	public static void main(String[] args) {
		TaskThread one = new TaskThread(0);
		TaskThread two = new TaskThread(1);
		TaskThread three = new TaskThread(2);
		TaskThread four = new TaskThread(3);
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(one);
		executor.execute(two);
		executor.execute(three);
		executor.execute(four);
		executor.shutdown();
		} 
	}
