package com.martinsemanu.core;

import java.util.Date;

public class Twit {
	
	double id;
	String from_user;
	double from_user_id;
	String profile_image_url;
	String text;
	Date created_at;

	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getFrom_user() {
		return from_user;
	}
	public void setFrom_user(String from_user) {
		this.from_user = from_user;
	}
	public double getFrom_user_id() {
		return from_user_id;
	}
	public void setFrom_user_id(double from_user_id) {
		this.from_user_id = from_user_id;
	}
	public String getProfile_image_url() {
		return profile_image_url;
	}
	public void setProfile_image_url(String profile_image_url) {
		this.profile_image_url = profile_image_url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}	
}
