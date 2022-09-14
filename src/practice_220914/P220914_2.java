package practice_220914;

import java.util.Scanner;

/*
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

각 테스트 케이스마다 A+B를 출력한다.


 */

public class P220914_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 5;
		
		for(int i=0; i<=x; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.printf("%d  %d   %d \n",A,B,A+B);
		}
		System.out.println("끝!");

	}

}
