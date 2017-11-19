package net.franckbenault.comparator.v2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import static java.util.stream.Collectors.toCollection;

public class Demo {

	public static void main(String[] args) {
		List<Integer> list = new Random(2664).ints(32L,1000,1100).boxed().collect(toCollection(ArrayList::new));
		
		//error very difficult to debug...
		//list.sort((a,b)-> a<b ? -1:a==b ? 0 :1);
		list.sort(logging((a,b)-> a<b ? -1:a==b ? 0 :1));
		
		System.out.println(list);
	}
	
	private static Comparator<Integer> logging(Comparator<Integer> c) {
		
		return (a,b) -> {
			int r = c.compare(a,b);
			System.out.printf("a= %d, b=%d, r=%d \n",a,b,r); 
			return r;
		};
	}
}
