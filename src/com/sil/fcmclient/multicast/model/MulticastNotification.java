package com.sil.fcmclient.multicast.model;

public class MulticastNotification {

	private String title;
	private String text;

	public MulticastNotification(String title, String text) {
		super();
		this.title = title;
		this.text = text;
	}

	public MulticastNotification() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
