package practice_221007;

import java.util.ArrayList;
import java.util.List;

public class p221007_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	 public static int minNum(int samDaily, int kellyDaily, int difference) {
		 
		 int minday=0;
		 List<Integer> alist = new ArrayList<Integer>();
		 
		 
		 if(samDaily>=kellyDaily) {
			 minday=-1;
		 }else {
			chk(samDaily, kellyDaily, difference, minday, alist, 0, 0);
			minday=alist.get(0);
		}
		 
		 
		 
		return minday;

	    }
	 
	 
	 
	 public static void chk(int samDaily, int kellyDaily, int difference, int minday, List<Integer> list
			 , int samsolved, int kellysolved) {
		 
		 int innersam= samsolved;
		 int innerkelly=kellysolved;
		 
		 
		 innerkelly=innerkelly+kellyDaily;
		 
		 if(minday==0) {
			 innersam=difference+samDaily;
		 }else {
			innersam=innersam+samDaily;
		}
		 
		 
		 if(samsolved>=kellysolved) {
			 chk(samDaily, kellyDaily, difference, minday+1, list, innersam, innerkelly);
		 }else {
			list.add(minday);
		}
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	
}
