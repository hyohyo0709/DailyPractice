package p220924_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Test5 {

	
	public static String[][] arr = new String[50][50];// 표 기본
	public static List<Object> alist = new ArrayList<Object>(); // 임시 저장공간
	public static HashMap<int[], String> temp = new HashMap<int[], String>();
	public static List<String> anslist = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		String[] ss = {"UPDATE 1 1 menu", "PRINT 1 1", "UPDATE menu fuck","PRINT 1 1" };
		System.out.println(solution(ss));
		
		

	}// 메인

	public static String[] solution(String[] commands) {
        
        
        for(int i=0; i<commands.length; i++) {
        	String[] split = commands[i].split(" ");
        	for(int j=0; j<split.length; j++) {
        		alist.add(split[j]); // 가상 공간에 명령어 삽입
        	}
        		if(alist.get(0).equals("UPDATE")) {// update 시작
        			if(alist.size()==4) {//update #1
        				UPDATE(Integer.parseInt((String)alist.get(1)),Integer.parseInt((String)alist.get(2)) ,alist.get(3).toString());        				
        			}else if (alist.size()==3) {// update#2
						UPDATE(alist.get(1).toString(), alist.get(2).toString());
					}
        		}// update 끝
        		else if (alist.get(0).equals("MERGE")) {//merge 시작
					MERGE(Integer.parseInt((String)alist.get(1)),Integer.parseInt((String)alist.get(2)),
							Integer.parseInt((String)alist.get(3)), Integer.parseInt((String)alist.get(4)));
				}//merge 끝
        		else if (alist.get(0).equals("UNMERGE")) {// unmerge 시작
					UNMERGE(Integer.parseInt((String)alist.get(1)), Integer.parseInt((String)alist.get(2)));
				}// unmerge 끝
        		else if (alist.get(0).equals("PRINT")) {//print 시작
				PRINT(Integer.parseInt((String)alist.get(1)), Integer.parseInt((String)alist.get(2)));
				}
        		
        		
        	alist.removeAll(alist);	
        	
        }
        String[] answer= new String[anslist.size()];
        for(int i=0; i<anslist.size(); i++) {
        	answer[i]=anslist.get(i);
        }
        
        
        return answer;
    }
	
	
	public static void UPDATE(int r, int c, String value) {
		int[] key = {r,c};
		temp.put(key, value);		
		
	}
	
	public static void UPDATE(String value1, String value2) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int[] key = {i,j}; 
				if(temp.get(key)!= null) {
					if(temp.get(key).equals(value1)) {
					temp.replace(key, value2);
					
				}
				}
				
			}
		}
	}
	
	public static void MERGE(int r1, int c1, int r2, int c2) {
		
		int[] key1 = {r1,c1};
		String val1 = temp.get(key1);
		
		
		int[] key2 = {r2, c2};
		String val2 = temp.get(key2);
		
		
		if(val1==null && val2!=null) {
			
			temp.replace(key1, val2);
		}else {
			temp.replace(key2, val1);
		}
		
		
	}
	
	public static void UNMERGE(int r, int c) {
		int[] key = {r, c};
		
	}
	
	public static void PRINT(int r, int c) {
		int[] key = {r, c};
		if(temp.get(key)==null) {
			anslist.add("EMPTY");
		}else {
			anslist.add(temp.get(key));
			
		}
	}
	
	
	
}//클래스



