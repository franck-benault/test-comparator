package net.franckbenault.comparator.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static java.util.stream.Collectors.toCollection;

public class Demo {

	public static void main(String[] args) {
		List<Integer> list = new Random(209).ints(32L).boxed().collect(toCollection(ArrayList::new));
		
		//error very difficult to debug...
		list.sort( (a, b) -> a-b);
		
		System.out.println(list);
	}
}
