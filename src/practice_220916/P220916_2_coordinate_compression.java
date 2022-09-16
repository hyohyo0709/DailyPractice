package practice_220916;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

/*
 * 
 * 수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.

Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.

X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.

첫째 줄에 N이 주어진다.

둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.

 * 
 * 첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.
 * 
 * 배열 내 크기에 따른 순서 즉 각 원소의 순위를 출력하면 된다
 * 
 */
public class P220916_2_coordinate_compression {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int N = 5;
		int[] alist = new int[N];
		
		for(int i=0; i<N; i++) {
			alist[i]= ran.nextInt(100000)-50000;
		}
		
		int[] ranked =alist.clone();
		Arrays.sort(ranked);
		
		
		
		HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>(); 
		
		int num =1;
		
		for(int i=0; i<ranked.length; i++) {
			
				if(!rank.containsKey(num)) { // 중복되는 넘 없을 때
				rank.put(ranked[i], num);
				num++;
			}
			
			
			
		}
		
		int[] numlist= new int[alist.length];
		
		for(int i=0; i<alist.length; i++) {
			numlist[i]=rank.get(alist[i]);
		}
		
		for(int i=0; i<alist.length; i++) {
			System.out.print(alist[i]+"  ");			
		}
		System.out.println("");
		
		for(int i=0; i<numlist.length; i++) {
			System.out.print(numlist[i]+" ");
		}
		
		
	}

}
