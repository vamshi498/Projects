package java8basics;

public class RunnableLamda {

	public static void main(String[] args) {

		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("in run method");
			};
		});

		myThread.start();
		
		//using Lambda
		Thread myLambdaThread = new Thread(() -> System.out.println("In lambda run method"));
		myLambdaThread.start();
	}
}
