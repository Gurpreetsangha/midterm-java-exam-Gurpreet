package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		PriorityQueue<Integer> numbers =new PriorityQueue<Integer>();
		numbers.add(123);
		numbers.add(234);
		numbers.add(345);
		numbers.add(456);
		numbers.add(567);

		System.out.println(numbers);

		//numbers.remove(1);
		//numbers.remove(3);
		System.out.println(numbers);

		for (int num:numbers){
			System.out.println(num);
		}
		System.out.println("while loop after remove element");

		Iterator iterator= numbers.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}


	}

}
