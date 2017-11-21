package net.franckbenault.comparator.v4;

public class TwoLevelComparatorGOOD {

	public int compare(Player a, Player b) {
		
		String nicknameA = a.getNickname();
		String nicknameB = b.getNickname();
		
		if(nicknameA== null) {
			if(nicknameB==null) {
				return a.getDisplayName().compareTo(b.getDisplayName());
			} else {
				return -1;
			}
		} else {
			if(nicknameB==null) {
				return 1;
			} else {
				int c = nicknameA.compareTo(nicknameB);
				if(c!=0) {
					return c;
				} else {
					return a.getDisplayName().compareTo(b.getDisplayName()); 
				}
			}
		}
		
	}
}
