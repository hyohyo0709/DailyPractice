package practice_220918;


import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/*
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 * 
 * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
 * 
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 
 * 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 * 
 * 재귀 알고리즘은 끝에서부터 체크해서 들어가줘야 한다
 * 
 */

import java.util.Random;

public class P220918_1_Recursive {

	
	
	static Random ran = new Random();
	static int N = ran.nextInt(8);
	static int M = ran.nextInt(N);
	
	
	static int[] arr = new int[M]; // 하나의 수열
	static boolean[] check = new boolean[M]; // 수열 중복 체크 
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) {
		
	
		
		
		

	}//메인

	
	
	
}// 클래스
