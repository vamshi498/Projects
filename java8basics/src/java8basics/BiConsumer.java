package java8basics;

import java.util.function.BiFunction;

public class BiConsumer {

	public static void main(String args[]) {
		int numbers [] = {1,2,3,4};
		int key = 2;
		//general
		//process(numbers,key);
		
		//lambda my way
		//processOperation(numbers, key, (i,k) -> i+k);
		
		//lamda generic way
		processLambda(numbers,key,(i,k) -> System.out.println(i/k));
		//new ABImple().test();
	}
	
	private static void processOperation(int[] numbers, int key, Operation operation) {
		
		for(int i : numbers) {
			operation.optn(i, key);
			System.out.println(i /key);
		}
	}

	private static void processLambda(int[] numbers, int key, java.util.function.BiConsumer<Integer, Integer> biconsumer) {
          for(int i :numbers) {
        	  biconsumer.accept(i, key);
          }
	}

	static void process(int numbers[],int key) {
		for(int i: numbers) {
			System.out.println(i+key);
		}
	}
	
	
	//Lambda way... Ask is take a argument and make it perform whatever operation we need
}


 interface Operation {
	
	 int optn(int i, int k);
}