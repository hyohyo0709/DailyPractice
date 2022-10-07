package practice_221007;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;



public class p221007_3_jason {

	
	
	
	public static String getPhoneNumbers(String country, String phoneNumber) throws Exception {

		
		   /*
	     * Complete the 'getPhoneNumbers' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts following parameters:
	     *  1. STRING country
	     *  2. STRING phoneNumber
	     * API URL: https://jsonmock.hackerrank.com/api/countries?name=<country>
	     */

	    public static String getPhoneNumbers(String country, String phoneNumber)  {



	String[] name = country.split(" ");
	String urlCountry=name[0];
	for(int i =1; i<name.length; i++){
	    urlCountry=urlCountry+"%20"+name[i];
	}




	String ans="";
	String result = "";

	try{
	    URL url = new URL("https://jsonmock.hackerrank.com/api/countries?name="+urlCountry);
	     BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
	     result=br.readLine();
	     
	     JSONParser jsonparser = new JSONParser();
	        JSONObject jsonobject = (JSONObject)jsonparser.parse(result);
	        
	        JSONArray data = (JSONArray)jsonobject.get("data");
	        JSONObject info = (JSONObject)data.get(0);
	        JSONArray callingCodesArr = (JSONArray)info.get("callingCodes");
	        String callingCodes = String.valueOf( callingCodesArr.get(callingCodesArr.size()-1));
	        
	        
	        
	        ans="+"+callingCodes +" "+phoneNumber;
	     
	}catch(Exception e){
	    e.printStackTrace();
	    ans="-1";
	}

	       
	  

	return ans;
	    }

		    }
	
	
	
}
