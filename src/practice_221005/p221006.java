package practice_221005;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



/*
 * 
 * 10,000 이하의 자연수로 이루어진 길이 N짜리 수열이 주어진다. 
 * 이 수열에서 연속된 수들의 부분합 중에 그 합이 S 이상이 되는 것 중, 가장 짧은 것의 길이를 구하는 프로그램을 작성하시오.
 * 
 * 
 * 첫째 줄에 N (10 ≤ N < 100,000)과 S (0 < S ≤ 100,000,000)가 주어진다.
 *  둘째 줄에는 수열이 주어진다. 수열의 각 원소는 공백으로 구분되어져 있으며, 10,000이하의 자연수이다.
 * 
 * 
 * 첫째 줄에 구하고자 하는 최소의 길이를 출력한다. 만일 그러한 합을 만드는 것이 불가능하다면 0을 출력하면 된다.
 * 
 * 
 */

public class p221006 {

	public static void main(String[] args) throws IOException {
		
		Random ran = new Random();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = ran.nextInt(19)+1; // 수열 길이 최대 100으로 함
		int S = ran.nextInt(1000); // 합이 나와야 하는 아이. 1000으로 함
		
		List<Integer> alist = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) { // 수열 생성
			alist.add(ran.nextInt(99)+1);
		}
		
		
		bw.write("길이: "+N+", "+"합 :"+S+"\n");
		bw.flush();
		bw.write(alist+"\n");
		bw.flush();
		
		for(int i =1; i<=alist.size(); i++) {
			
			if(chk(i, alist, S)) {
				bw.write("최소길이: "+i);
				bw.flush();
				break;
			}else if(i==alist.size() && !chk(i, alist, S)) {
				bw.write("불가능 "+0);
				bw.flush();
			}
		}
		
		bw.close();
		

	}
	
	
	public static boolean chk(int i, List<Integer> list, int S) {// 판별기
		
		boolean chk = false;
		
		List<Integer> box =new ArrayList<Integer>();
		cal(i, list, 0, 0, box, S);
//		System.out.println("길이 :"+i+"일 때 "+box);
		
		for(int j=0; j<box.size(); j++) {
			if(box.get(j)>=S) {
				chk=true;
			}
			
		}
		
		return chk;
		
	}
	
	
	public static void cal(int i, List<Integer> list, int n, int sum, List<Integer> box, int S) {// 재귀 메소드
		
		int innersum=0;
		
		
		for(int j=n; j<list.size(); j++) {
			innersum=list.get(j);
			if(n<i){// 재귀 부분
				
				cal(i, list, n+1,sum+innersum, box, S);
				
			}else {
				if(sum>=S) {
					box.add(sum);
				}
				

			}
		}
			
		
		     
			
			
			
		
		
		
	}
	
	

}
