package practice_220922;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

/*
 * 
 * 
 * 도현이의 집 N개가 수직선 위에 있다. 각각의 집의 좌표는 x1, ..., xN이고, 집 여러개가 같은 좌표를 가지는 일은 없다.

도현이는 언제 어디서나 와이파이를 즐기기 위해서 집에 공유기 C개를 설치하려고 한다. 
최대한 많은 곳에서 와이파이를 사용하려고 하기 때문에, 한 집에는 공유기를 하나만 설치할 수 있고,
 가장 인접한 두 공유기 사이의 거리를 가능한 크게 하여 설치하려고 한다.

C개의 공유기를 N개의 집에 적당히 설치해서, 가장 인접한 두 공유기 사이의 거리를 최대로 하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 집의 개수 N (2 ≤ N ≤ 200,000)과 공유기의 개수 C (2 ≤ C ≤ N)이 하나 이상의 빈 칸을 사이에 두고 주어진다. 
 * 둘째 줄부터 N개의 줄에는 집의 좌표를 나타내는 xi (0 ≤ xi ≤ 1,000,000,000)가 한 줄에 하나씩 주어진다.
 * 
 * 첫째 줄에 가장 인접한 두 공유기 사이의 최대 거리를 출력한다.
 * 
 * 나올 수 있는 최솟값 중 최댓값을 구하라
 * 
 * 
 * 해당 문제는 못 풀고 중복되지 않는 수열 만드는게 먼저였다...
 * 
 * 생각하는 방법 : 최소거리를 1부터 점차 올려주는데 이 때, 각각 최소거리일 때의 최대한 많이 설치할 수 있는 공유기 개수를 구해준다
 * 그리고 각각의 최대 공유기 개수가 C보다 같거나 작아지기 직전의 최소거리를 구해주면 된다
 * 
 * 
 */
public class P220922_1 {

	static int point; // 각각 최소거리가 갖는 최대 설치 개수
	
	
	
	
	public static int getPoint() {
		return point;
	}

	public static void setPoint(int point) {
		P220922_1.point = point;
	}

	
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		int N = ran.nextInt(18)+2; // 집 개수 = 좌표 개수
		int C = ran.nextInt(N-1)+1; // 공유기 개수
		
		System.out.println("집 개수 "+N);
		System.out.println("공유기 개수 "+C);
		List<Integer> xlist = new ArrayList<Integer>(); // 좌표 넣을 리스트
		
		
	while(xlist.size()<N) {
		
			int aa = ran.nextInt(30);
			
			boolean chk =true;
			
			if(xlist.size()!=1) {
				for(int i=0; i<xlist.size(); i++) { //중복 체크
				
				if(aa==xlist.get(i)) {
					chk=false;
				}
			}
			}
			
			if(chk) {
				xlist.add(aa);
				
			}
			
		
	}
		
	
		
		Collections.sort(xlist); //list 정렬
		System.out.println("집 좌표 :"+xlist);
		
		
		int min =1; //최소거리 변수
	 
		int pointmax=C;
		
		do {
			
			
			chkchk(xlist, 3, min, point);
			min++;
			
			 pointmax=getPoint();
		}while(pointmax>=C);
			
			
		System.out.println("최대 개수 : "+ pointmax);
		System.out.println(min);
		
	
	}// 메인
	
	public static void chkchk(List<Integer> list, int min, int index, int point) {
		
		
			for(int i=index+1; i<list.size(); i++) {
				
				if((list.get(i)-list.get(index))>=min) {
					if(index==list.size()-1) {
						setPoint(point);
					}
						chkchk(list, min, i, point+1);
			
			break;
					

			
			
		}
				
				
			}
			
			System.out.println(point);
			
		
	}//chkchk
	
	

}// 클래스
