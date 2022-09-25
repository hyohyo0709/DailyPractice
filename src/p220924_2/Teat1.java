package p220924_2;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Teat1 {

	public static void main(String[] args) throws NumberFormatException, Exception {
	
		 String[] aa ={"A 6","B 12","C 3"};
		 String[] bb ={"2021.05.02 A","2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		

		System.out.println(solution("2022.05.19",aa ,bb));
		
	}
	
	
	public static int[] solution(String today, String[] terms, String[] privacies) throws NumberFormatException, Exception {
        int[] answer = {};
        
        String[] type = new String[terms.length];
        String[] time = new String[terms.length];
        List<Integer> alist = new ArrayList<Integer>(); // 임시
        
        int count =0;
        
        for(int i=0; i<terms.length; i++) { // term 정리
        	String[] split = terms[i].split(" ");
        	type[i]=split[0];
        	time[i]=split[1];
        }
        
        for(int i=0; i<privacies.length; i++) {
        	String[] split = privacies[i].split(" ");
        	
        	for(int j=0; j<terms.length; j++) {// 비교 시작
        		if(split[1].equals(type[j])) {
//        			System.out.println(split[1]+","+type[j]);
//        			System.out.println(today);
//        			System.out.println(addDate(split[0], 0, Integer.parseInt(time[j]) , 0));
//        			System.out.println(time[j]);
        			if(datechk(today, addDate(split[0], 0, Integer.parseInt(time[j]) , 0))) {
        				
        				count=count+1;
        			alist.add(i+1);
        			}
        		}
        	}
        }
        
//        System.out.println(count);
        answer=new int[count];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i]=alist.get(i);
        }
        
       
        
        Arrays.sort(answer);
        
        return answer;
    }//솔루
	
	
	public static String addDate(String strDate, int year, int month, int day)throws Exception  {
			
		 SimpleDateFormat dtFormat = new SimpleDateFormat("yyyy.MM.dd");
	        
			Calendar cal = Calendar.getInstance();
	        
			Date dt = dtFormat.parse(strDate);
	        
			cal.setTime(dt);
	        
			cal.add(Calendar.YEAR,  year);
			cal.add(Calendar.MONTH, month);
			cal.add(Calendar.DATE,  day);
	        
			return dtFormat.format(cal.getTime());
	
	}
	
	
	public static boolean datechk(String date1, String date2) throws ParseException {
		boolean chk = false;
		
		 SimpleDateFormat dtFormat = new SimpleDateFormat("yyyy.MM.dd");
		 Date dt1 = dtFormat.parse(date1);
		 Date dt2 = dtFormat.parse(date2);
		 
		 System.out.println(dt1.compareTo(dt2));
		 
		 if(dt1.compareTo(dt2)>=0) {
			 chk=true;
//			 System.out.println("왜 다 뜨노");
		 }
		 return chk;
	}
	
	
	
	
	

}// 클래스
