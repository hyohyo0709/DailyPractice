package practice_220920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)

이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며, 
정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.

정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.
 * 
 * 재민이가 최종적으로 적어 낸 수의 합을 출력한다. 최종적으로 적어낸 수의 합은 231-1보다 작거나 같은 정수이다.
 * 
 * 
 * 
 * 예제 2의 경우를 시뮬레이션 해보면,

[1]
[1,3]
[1,3,5]
[1,3,5,4]
[1,3,5] (0을 불렀기 때문에 최근의 수를 지운다)
[1,3] (0을 불렀기 때문에 그 다음 최근의 수를 지운다)
[1,3,7]
[1,3] (0을 불렀기 때문에 최근의 수를 지운다)
[1] (0을 불렀기 때문에 그 다음 최근의 수를 지운다)
[1,6]
합은 7이다.
 * 
 * 
 */



public class P220920 {

	public static void main(String[] args) throws IOException {
		
		Random ran = new Random();
		
		int K = ran.nextInt(20)+1;
		
		int [] arr = new int[K]; //최초 배열
		List list = new ArrayList(); // 최초 배열을 넣을 녀석
		
		
		for(int i=0; i<arr.length; i++) {// 최초 배열 생성
			if(i==0) {
				arr[i]=ran.nextInt(100)+1;
			}else {
				arr[i]=ran.nextInt(101);
			}
		}
		
		for(int i=1; i<=arr.length; i++) { //배열을 list에 넣는다
			
			//0 앞 최근 녀석들 지워주기
			if(i!=arr.length) {
				if(arr[i]!=0 && arr[i-1]!=0) {
					list.add(arr[i-1]);	
				}
				
			}else if(arr[i-1]!=0){
				list.add(arr[i-1]);	
				}
				
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<arr.length; i++) {
			bw.write(arr[i]+" ");
			
		}
//		bw.flush();
		
		
		bw.write("\n");
		
		
		int sum=0;
		for(int i=0; i<list.size(); i++) {
			sum= sum+(int)list.get(i);
		}
		
		bw.write("합계: "+sum+"\n");
		bw.flush();
		System.out.println("처리한 애들 : "+list);
		
		
		
		bw.close();
		

	}

}
