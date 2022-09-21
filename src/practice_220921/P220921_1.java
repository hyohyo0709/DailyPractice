package practice_220921;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 
 * 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 
 * 모든 정수의 범위는 -2^31 보다 크거나 같고 2^31보다 작다.
 * M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
 * 
 */
public class P220921_1 {

	public static void main(String[] args) throws IOException {
		
		Random ran = new Random();
		
		int N = ran.nextInt(100)+1;
		int M = ran.nextInt(100)+1;
		
		List<Integer> nlist = new ArrayList<Integer>();
		List<Integer> mlist = new ArrayList<Integer>();
		List<Integer> ans = new ArrayList<Integer>();//결과를 담을 리스트
		boolean chk = false; // 판별기
		
		for(int i=0; i<N; i++) {
			nlist.add(ran.nextInt(100)-50);
		}
		
		for(int i=0; i<M; i++) {
			mlist.add(ran.nextInt(100)-50);
		}
		
		
		for(int i=0; i<mlist.size(); i++) {
			
			for(int j=0; j<nlist.size(); j++) {
				if(mlist.get(i)==nlist.get(j)) {
					chk=true;
					break;
				}
			}
			
			if(chk) {
				ans.add(1);
				chk=false;
			}else {
				ans.add(0);
			}
			
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("N : "+nlist+"\n");
		bw.flush();
		bw.write("M : "+mlist+"\n");
		bw.flush();
		bw.write("결과 : "+ans+"\n");
		bw.flush();
		
		if(mlist.size()==ans.size()) {
			bw.write("사이즈가 같네욧");
			bw.flush();
		}
		bw.close();
		
		

	}//메인

}//클래스
