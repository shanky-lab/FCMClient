package com.sil.fcmclient;

import com.sil.fcmclient.multicast.model.MulticastMessage;
import com.sil.fcmclient.response.model.PushNotificationResponse;
import com.sil.fcmclient.unicast.model.Message;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface FCMService {

	@POST("send")
	@Headers(value = { "Content-Type:application/json" })
	public Call<PushNotificationResponse> sendMulticast(@Header("Authorization") String serverKey, @Body MulticastMessage message);

	@POST("send")
	@Headers(value = { "Content-Type:application/json" })
	public Call<PushNotificationResponse> sendUnicast(@Header("Authorization") String serverKey, @Body Message message);
}
