package p220924_1;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Test1 {

	public static void main(String[] args) {
		
		int[][] aa = {{2,10},{7,1},{2,5},{7,32},{2,9}};
		
		solution(aa);
		
		System.out.println(solution(aa));
		

	}
	
	
	
	public static int solution(int[][] queries) {
		
		int count=0;
		
		for(int i=1; i<=1000; i++) {
			int sum=0;
			for(int j=0; j<queries.length; j++) {
				
				if(queries[j][0]==i) {	
					
						if(chkchk(sum,sum+queries[j][1], 0)==1) {
						count=count+sum;					
					}
						
					sum=sum+queries[j][1];
					
					
				}
			}
			
			
			
		}
		
		
		return count;
		
	}// 솔류션
	
	
	public static int chkchk(int sum, int sumplus, int qrt) {
		int chk = 0;
		
		
			if(sum>= Math.pow(2, qrt) && sum<=Math.pow(2, (qrt+1)) && sumplus > Math.pow(2, qrt+1)) {
				chk=1;
			}else if (sum<=Math.pow(2, (qrt+1)) && sumplus <= Math.pow(2, qrt+1) ) {
				chk=2;
			}else if(chk==0){
				chkchk(sum, sumplus, qrt+1);
			}
		
		
		
		return chk;
	}
	
	
	
	
	

}
