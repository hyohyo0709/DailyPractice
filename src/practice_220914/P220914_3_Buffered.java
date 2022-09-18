package practice_220914;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

/*
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 100)

각 테스트 케이스마다 A+B를 출력한다.

속도 높이기
Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

 */
public class P220914_3_Buffered {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		
		int T = 5;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	
		
		for(int i=1; i<=T; i++) {
			int X_1= Integer.parseInt(br.readLine());
			int x_2= Integer.parseInt(br.readLine());
			int r_1= Integer.parseInt(br.readLine());
			
		}
		
		

	}

}
