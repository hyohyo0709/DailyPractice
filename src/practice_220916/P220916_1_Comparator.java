package practice_220916;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;



/*
 * 
 * 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. 
 * (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
 * 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 */


public class P220916_1_Comparator {

	
	
	static int N=5;
	public static void main(String[] args) {
		
		
		int[][] alist = new int[N][];
		
		Random ran = new Random();
		
		
		for(int i=0; i<N; i++) {
			int x = ran.nextInt(200000)-100000;
		int y = ran.nextInt(200000)-100000;
			
			int[] aa = {x,y};
			alist[i]=aa;
		}
		
//		이중 배열 비교 Comparator 
		Arrays.sort(alist, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) { // x좌표가 같다면의 조건(즉 x좌표 기준)
					return o1[1]-o2[1];//오름차순
				}else {
					return o1[0]-o2[0];
				}
				
			}
		});
		
		System.out.println(N);
		for(int i=0; i<alist.length; i++) {
			System.out.println(alist[i][0]+","+alist[i][1]);
		}
		
		
		

	}
	
	
//	public static int[] point() {
//		
//		Random ran = new Random();
//		int x = ran.nextInt(200000)-100000;
//		int y = ran.nextInt(200000)-100000;
//		
//		
//		int[] pp = {x,y};
//		
//		
//		
//		return pp;
//	}

}
