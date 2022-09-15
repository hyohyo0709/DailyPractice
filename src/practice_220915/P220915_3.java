package practice_220915;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 
 * 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로,
이들 소수의 합은 620이고, 최솟값은 61이 된다.

입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.

M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.

 * M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 

단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
 * 
 * 
 */

public class P220915_3 {

	public static void main(String[] args) {
		
		int M=100;
		int N=60;
		
		List Xlist= new ArrayList();
		
						
		for(int i=N; i<=M; i++) {

			int X=i;
			int count=0; //소수판별기 , 0이면 소수
			
			for(int j=2; j<X; j++) {
//각각 수에 대한 소수판별 시작				
				 // j : 2부터 돌릴 애들
				
				if(X%j==0) {
					count++;
				}
				
				
			}//판별기 끝
			
			if(count==0) {
					
					Xlist.add(X);
				}
			
			count=0;
			
			
		} //  수 돌리기

		
	
		
		
		int sum=0;
		for(int i=0; i<Xlist.size(); i++) {
			sum=sum+ (int)Xlist.get(i);
		}
		System.out.println(Xlist);
		System.out.println("최솟값:  "+Xlist.get(0));
		System.out.println("합계:" + sum);
	}//메인

}//class
