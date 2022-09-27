package practice_220927;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 *
 * 널리 잘 알려진 자료구조 중 최대 힙이 있다. 최대 힙을 이용하여 다음과 같은 연산을 지원하는 프로그램을 작성하시오.

배열에 자연수 x를 넣는다.
배열에서 가장 큰 값을 출력하고, 그 값을 배열에서 제거한다.
프로그램은 처음에 비어있는 배열에서 시작하게 된다.


 * 첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다.
 *  만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고, x가 0이라면 배열에서 가장 큰 값을 출력하고 그 값을 배열에서 제거하는 경우이다. 
 *  입력되는 자연수는 2^31보다 작다.
 * 
 * 입력에서 0이 주어진 회수만큼 답을 출력한다. 만약 배열이 비어 있는 경우인데 가장 큰 값을 출력하라고 한 경우에는 0을 출력하면 된다.
 * 
 */


public class p220927_1 {

	public static void main(String[] args) throws IOException {
		
		Random ran = new Random();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = ran.nextInt(99999)+1;
		List<Integer> alist = new ArrayList<Integer>();
		bw.write(N+"\n");
		bw.flush();
		
		for(int i=1; i<=N; i++) {
			int X = ran.nextInt(10000);
			alist.add(X);
			
			if(X==0) {
				
			int max= Collections.max(alist);
			bw.write(max+"\n");
			bw.flush();
			alist.remove(max);
			}
		}
		
		bw.close();
		
		
		

	}

}
