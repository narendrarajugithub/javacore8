package com.ust.core.java8.foreach;



import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr= {1,2,3,4,5,6,7};
		List<Integer> list= Arrays.asList(arr);
				//new ArrayList<Integer>(); 
		
		Consumer consumer=(i)->System.out.println("lemda "+i);
		list.forEach(consumer);
	
		
		  list.forEach(new Consumer<Integer>() {
		  @Override public void accept(Integer t) { // TODO Auto-generated method stub
		  System.out.println("Annonamus "+t); }
		  
		  });
		 
		
		
	}

}
