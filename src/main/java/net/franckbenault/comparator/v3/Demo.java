package net.franckbenault.comparator.v3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import static java.util.stream.Collectors.toCollection;

public class Demo {

	public static void main(String[] args) {
		List<Double> list = new Random(284397476).ints(100L)
				.map(Math::abs)
				.mapToDouble(i -> Math.sqrt((double)i))
				.boxed().collect(toCollection(ArrayList::new));
		
		
		list.sort((a,b)-> a<b ? -1:a>b ? 1 :0);
		//list.sort(logging((a,b)-> a<b ? -1:a>b ? 1 :0));
		//good solution
		//list.sort(Double::compare);
		//natural sort
		//list.sort(null);
		
		System.out.println(list);
	}
	
	private static Comparator<Double> logging(Comparator<Double> c) {
		
		return (a,b) -> {
			int r = c.compare(a,b);
			System.out.printf("a= %f, b=%f, r=%d \n",a,b,r); 
			return r;
		};
	}
}
