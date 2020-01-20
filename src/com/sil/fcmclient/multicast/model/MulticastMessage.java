package com.sil.fcmclient.multicast.model;

import java.util.List;

public class MulticastMessage {

	private List<String> registration_ids;
	private Data data;
	private MulticastNotification notification;

	public MulticastMessage() {
	}

	public MulticastMessage(List<String> registration_ids, Data data, MulticastNotification multicastNotification) {
		this.registration_ids = registration_ids;
		this.data = data;
		this.notification = multicastNotification;
	}

	public List<String> getRegistration_ids() {
		return registration_ids;
	}

	public void setRegistration_ids(List<String> registration_ids) {
		this.registration_ids = registration_ids;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public MulticastNotification getNotification() {
		return notification;
	}

	public void setNotification(MulticastNotification multicastNotification) {
		this.notification = multicastNotification;
	}

	/**
	 * { "registration_ids":[ "fcm token 1", "fcm token 2", "fcm token 3" ],
	 * "data":{ "message":"msg" }, "notification":{ "title":"App name", "text":"
	 * your msg" } }
	 */
}
