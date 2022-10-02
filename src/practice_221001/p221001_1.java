package practice_221001;

import java.util.ArrayList;
import java.util.List;

public class p221001_1 {

	List<Integer> alist = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		

	}

	
	
	 public int solution(int N, int K) {
	      
		 int i =1;
		 
		 chkmehod(i, N, K);
		 
		 return alist.get(0);
	    }//솔루션
	 
	 
	 public void chkmehod(int i, int N, int K) {
		 
		 boolean on=false;
		 int chk = i;
		 int ans = 0;
		 
		 for(int k=N;k>=1; k-- ) {
			 int sum=0;
		 
		 for(int j=0; j<i; j++) {
			 sum=sum+(k-j);
			 ans=sum;
			 
		 } if(ans==K) {
			 	 alist.add(chk);
                  on=true;
			 	 break;
		 }

		 }
		 
		 
		 
		if(!on) {
			  if (chk>N) {
			alist.add(-1);
		}else {
			chkmehod(i+1, N, K);
		}
		 	 
		 	
	 }
		 
		 
		 
		 
		 
		 
		 
	 }//메소드
	 
	 
	 
}
