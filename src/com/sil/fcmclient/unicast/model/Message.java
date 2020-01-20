package com.sil.fcmclient.unicast.model;

public class Message {

	private String to;
	private UnicastNotification unicastNotification;

	public Message() {
	}

	public Message(String to, UnicastNotification unicastNotification) {
		super();
		this.to = to;
		this.unicastNotification = unicastNotification;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public UnicastNotification getNotification() {
		return unicastNotification;
	}

	public void setNotification(UnicastNotification unicastNotification) {
		this.unicastNotification = unicastNotification;
	}

}
