package practice_220920;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * 
 * 크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다. 
 * Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오큰수는 -1이다.

예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다. 
A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.
 *
 * 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에 수열 A의 원소 A1, A2, ..., AN (1 ≤ Ai ≤ 1,000,000)이 주어진다.
 * 총 N개의 수 NGE(1), NGE(2), ..., NGE(N)을 공백으로 구분해 출력한다.
 * 
 * 
 * 
 */

public class P220920_2 {

	public static void main(String[] args) throws IOException {
		
		Random ran = new Random();
		
		int N = ran.nextInt(1000)+1;
		
		int[] arr = new int[N];// 오리지널 배열
		List<Integer> list = new ArrayList<Integer>(); // 오큰수들 넣는 리스트
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=ran.nextInt(1000)+1;
		}
		
		for(int i=0; i<arr.length; i++) {	
			List<Integer> dummy = new ArrayList<Integer>();//오큰수가 없는 것을 체크할 때 쓰는 리스트
			
			for(int j=i; j<arr.length; j++) {
				dummy.add(arr[j]);
				
			}
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j]>arr[i]) {
					list.add(arr[j]);
					break;
				}
				
			}
			
			
			
			
			if(Collections.max(dummy)<=arr[i]) {// 오큰수가 없을 때 -1 넣기
			list.add(-1);		
				}
			
//			System.out.println(dummy);
		}
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<arr.length; i++) {
			bw.write(i+1+"번" +arr[i]+" ");
			
		}
		bw.write("\n");
		bw.flush();
		
		bw.write("오큰수: "+ list);
		bw.flush();
		
		
		
		
		bw.close();
		
		
		

	}//메인

}//클래스
