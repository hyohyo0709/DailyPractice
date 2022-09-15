package practice_220915;

import java.util.Scanner;

/*
 * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
 * 
 * 
 * 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
 * 
 */
public class P220915_1 {

	public static void main(String[] args) {
		
		
		int V = 100;
		int A = 5;
		int B = 1;
		
		int day = 0;
		int total = 0;
		
		
		while(total<V) {
			total =total+A-B;
			day=day+1;
		}
		
		System.out.println(day +"일");
		
		
		

	}

}
