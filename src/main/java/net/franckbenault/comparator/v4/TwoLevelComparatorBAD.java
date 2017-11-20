package net.franckbenault.comparator.v4;

public class TwoLevelComparatorBAD {

	public int compare(Player a, Player b) {
		
		String nicknameA = a.getNickname();
		String nicknameB = b.getNickname();
		
		if(nicknameA!=null && nicknameB!=null) {
			int c = nicknameA.compareTo(nicknameB);
			if(c==0) {
				return a.getDisplayName().compareTo(b.getDisplayName());
			} else {
				return c;
			}
			
		} else {
		
			return 0;
		}
	}
}
