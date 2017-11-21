package net.franckbenault.comparator.v5;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

public class ComparatorAndEquals {

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("1.00");
		BigDecimal b = new BigDecimal("1.0");
		System.out.println("In big decimal is comparator not consistent with equals because big decimal has a scale ");
		System.out.println("1.00 compareTo 1.0 "+a.compareTo(b));
		System.out.println("1.00 equals    1.0 "+a.equals(b));
	
		Double c = new Double("1.00");
		Double d = new Double("1.0");
		System.out.println("--------------------------------------------------");
		System.out.println("In Double is comparator not consistent with equals");
		System.out.println("1.00 compareTo 1.0 "+c.compareTo(d));
		System.out.println("1.00 equals    1.0 "+c.equals(d));

		
		TreeSet<BigDecimal> ts = new TreeSet<BigDecimal>();
		ts.add(a);
		
		HashSet<BigDecimal> hs = new HashSet<BigDecimal>();
		hs.add(b);

		System.out.println("--------------------------------------------------");
		System.out.println("treeSet.equals(hashSet) treeSet uses compareTo "+ts.equals(hs));
		System.out.println("hashSet.equals(treeSet) hashSet uses equals    "+hs.equals(ts));		
	}

}
