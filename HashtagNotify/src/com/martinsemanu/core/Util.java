package com.martinsemanu.core;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Util {
	
	private static final String TAG_ID = "id";
	private static final String TAG_FROM_USER = "from_user";
	private static final String TAG_FROM_USER_ID = "from_user_id";
	private static final String TAG_PROFILE_IMAGE_URL = "profile_image_url";
	private static final String TAG_TEXT = "text";
	private static final String TAG_CREATED_AT = "created_at";
	
	public Twit[] PesquisarTwits(){
		
		Twit[] twitArray = null;
		JSONParser jParser = new JSONParser();
		JSONObject json = jParser.getJsonFromUrl("http://search.twitter.com/search.json?q=cpbr6");
		
		JSONArray twits = null;
		
		try{
			twits = json.getJSONArray("results");
			
			twitArray = new Twit[twits.length() - 1];
			
			for (int i =0; i< twits.length(); i++){
				JSONObject c = twits.getJSONObject(i);
				
				twitArray[i] = new Twit();
				twitArray[i].setId(c.getDouble(TAG_ID));
				twitArray[i].setFrom_user(c.getString(TAG_FROM_USER));
				twitArray[i].setFrom_user_id(c.getDouble(TAG_FROM_USER_ID));
				twitArray[i].setProfile_image_url(c.getString(TAG_PROFILE_IMAGE_URL));
				twitArray[i].setText(c.getString(TAG_TEXT));
				
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				
				twitArray[i].setCreated_at(formatter.parse( c.getString(TAG_CREATED_AT)));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return twitArray;
	}
}
