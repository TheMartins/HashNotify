package com.martinsemanu.core;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Util {
	
	public static void PesquisarTwits(){
		JSONParser jParser = new JSONParser();
		JSONObject json = jParser.getJsonFromUrl("http://search.twitter.com/search.json?q=cpbr6");
		
		
	}
}
