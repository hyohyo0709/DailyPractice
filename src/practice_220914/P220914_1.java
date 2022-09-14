package practice_220914;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


/*
 * 
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 * 
 */



public class P220914_1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
//		int x = ran.nextInt(1000000);
		int x =10;
		int[] y = new int[x];
		
		System.out.println(x);
		for(int i=0; i<y.length; i++) {
			y[i]=ran.nextInt(2000000)-1000000;
			System.out.print(y[i]+" ");
			
		}
		System.out.println();
		
		int max = y[0];
		for(int i=0; i<y.length; i++) {
			if(y[i]>max) {
				max=y[i];
			}
		}
		
		int min = y[0];
		for(int i=0; i<y.length; i++) {
			if(y[i]<min) {
				min=y[i];
			}
		}
		
		
		System.out.println("최댓값 : "+max);
		System.out.println("최소 : " + min);
		
		
		Arrays.sort(y); // 배열을 크기 순서대로 정렬
		System.out.println("최댓값 : " + y[y.length-1]);
		System.out.println("최소 : " + y[0]);
		
		
		
		
		
		
		
		
		

	}

}
