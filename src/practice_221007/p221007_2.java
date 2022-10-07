package practice_221007;


import java.util.Collections;
import java.util.List;


public class p221007_2 {

	 public static long getMinimumHealth(List<Integer> initial_players, List<Integer> new_players, int rank) {

		 long neededhealth=0;

//		 long[] arr = new long[1];
		 
		 
		for(int i=0; i<=new_players.size(); i++) {
			
			if(i!=0) {
				initial_players.add(new_players.get(i-1));
			}
			
			Collections.sort(initial_players, Collections.reverseOrder());

			
			neededhealth= neededhealth+ initial_players.get(rank-1);
		}
		
		 
//		 int count=0;
//		 
//		 while(count<=new_players.size()) {
//			 if(count!=0) {
//					initial_players.add(new_players.get(count-1));
//				}
//				
//				Collections.sort(initial_players, Collections.reverseOrder());
//	
//				
//				neededhealth= neededhealth+ initial_players.get(rank-1);
//			 count++;
//			 
//		 }
		 
//		 chk(initial_players, new_players, rank, 0, neededhealth, arr);
//		 
//		  neededhealth=arr[0];
		
			
			return neededhealth;
		
		    }
	 
	 
//	 public static void chk(List<Integer> initial_players, List<Integer> new_players, int rank, int count,
//			 long neededhealth, long[] arr ) {
//		 
//		 long innerhealth = neededhealth;
//		 
//		 
//		 if(count!=0) {
//				initial_players.add(new_players.get(count-1));
//			}
//			
//			Collections.sort(initial_players, Collections.reverseOrder());
//
//			
//			innerhealth= innerhealth+ initial_players.get(rank-1);
//			
//			if(count<=new_players.size()) {
//				chk(initial_players, new_players, rank, count, innerhealth, arr);
//			}else {
//				arr[0]=innerhealth;
//			}
//		 
//		 
//	 }
	 
	 
	 
	 
	
	
}
