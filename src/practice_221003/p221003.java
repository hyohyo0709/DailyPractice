package practice_221003;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 
 * n개의 서로 다른 양의 정수 a1, a2, ..., an으로 이루어진 수열이 있다. ai의 값은 1보다 크거나 같고,
 * 1000000보다 작거나 같은 자연수이다. 자연수 x가 주어졌을 때, 
 * ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하는 프로그램을 작성하시오.
 * 
 * 
 * 첫째 줄에 수열의 크기 n이 주어진다. 다음 줄에는 수열에 포함되는 수가 주어진다. 
 * 셋째 줄에는 x가 주어진다. (1 ≤ n ≤ 100000, 1 ≤ x ≤ 2000000)
 * 문제의 조건을 만족하는 쌍의 개수를 출력한다.
 */



public class p221003 {

	public static void main(String[] args) throws IOException {
		Random ran = new Random();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> alist = new ArrayList<Integer>(); //최초 수열
		
		List<int[]> sel = new ArrayList<int[]>(); // 짝들 넣을 리스트
		
		int N = ran.nextInt(999)+1;// 수열 크기
		int X = ran.nextInt(19999)+1; // 문제의 수 X
		
		
		for(int i =1; i<=N; i++) {// 최초 수열 생선
			alist.add(ran.nextInt(9999)+1);
		}
		
		
		for(int i=0; i<alist.size()-1; i++) {
			for(int j=i+1; j<alist.size(); j++) {
				int chk = alist.get(i)+alist.get(j);
				
				if(chk==X) {
					int[] ho = {alist.get(i), alist.get(j)};
					sel.add(ho);
				}
			}
		}
		
		
		bw.write(N+"\n");
		bw.flush();
		bw.write(alist+"\n");
		bw.flush();
		bw.write(sel.size()+"개");
		bw.flush();
		bw.close();
		
		
		

	}

}
