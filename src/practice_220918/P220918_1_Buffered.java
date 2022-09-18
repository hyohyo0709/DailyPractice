package practice_220918;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.StringTokenizer;

/*
 *첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.

한 줄에 x1, y1, r1, x2, y2, r2가 주어진다. x1, y1, x2, y2는 -10,000보다 크거나 같고,
 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다. 
 *
 * 각 테스트 케이스마다 류재명(두 원의 교점)이 있을 수 있는 위치의 수를 출력한다.
 *  만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.
 * 
 * 
 * 
 * 
 */


public class P220918_1_Buffered {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int T=3;
		System.out.println("T="+T);
		Random ran = new Random();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<=T; i++) {
			int x_1 = ran.nextInt(20000)-10000;
			int y_1 = ran.nextInt(20000)-10000;
			int x_2 = ran.nextInt(20000)-10000;
			int y_2 = ran.nextInt(20000)-10000;
			int r_1 = ran.nextInt(10000);
			int r_2 = ran.nextInt(10000);
			bw.write(x_1+" "+x_2+" "+y_1+" "+y_2+" "+r_1+" "+r_2+" ========>"+check(x_1, x_2, y_1, y_2, r_1, r_2)+"\n");
			
		}
		bw.flush();
		bw.close();

	}// 메인

	
	
	public static int check(int x_1, int x_2, int y_1, int y_2, int r_1, int r_2) {
		
	 	double p_distance = Math.sqrt((x_1-x_2)*(x_1-x_2)+(y_1-y_2)*(y_1-y_2));
	 	int r_distance = r_1+r_2;
	 	int chk =0;
	 	
	 	if(p_distance!=0) {
	 		if (p_distance>r_distance) {
			chk= 0;
		}else if (p_distance<r_distance) {
			chk= 2;
		}else if (p_distance==r_distance) {
			chk= 1;
		}
	 	}
		else {
			if(r_1!=r_2) {
				chk= 0;
			}else {
				chk= -1;
			}
		}
	 	
		
	  
		return chk;
		
	}// 체크
	
	
	
	
	
	
}// 클래스
