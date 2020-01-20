package com.sil.fcmclient.response.model;

import java.util.List;

public class PushNotificationResponse {

	private long multicast_id;
	private long success;
	private long failure;
	private long canonical_ids;
	private List<Result> results;

	public PushNotificationResponse() {
	}

	public long getMulticast_id() {
		return multicast_id;
	}

	public void setMulticast_id(long multicast_id) {
		this.multicast_id = multicast_id;
	}

	public long getSuccess() {
		return success;
	}

	public void setSuccess(long success) {
		this.success = success;
	}

	public long getFailure() {
		return failure;
	}

	public void setFailure(long failure) {
		this.failure = failure;
	}

	public long getCanonical_ids() {
		return canonical_ids;
	}

	public void setCanonical_ids(long canonical_ids) {
		this.canonical_ids = canonical_ids;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	
}
