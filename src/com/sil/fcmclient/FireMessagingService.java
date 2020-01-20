package com.sil.fcmclient;

import com.sil.fcmclient.multicast.model.MulticastMessage;
import com.sil.fcmclient.response.model.PushNotificationResponse;
import com.sil.fcmclient.unicast.model.Message;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class FireMessagingService {
	private HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
	private OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

	private String apiServerKey;
	private Retrofit retrofit;
	private FCMService service;

	public FireMessagingService(String apiServerKey) {
		logging.setLevel(Level.BODY);
		httpClient.addInterceptor(logging); // <-- this is the important line!
		this.apiServerKey = "key=" + apiServerKey;
		retrofit = new Retrofit.Builder().client(httpClient.build()).baseUrl("https://fcm.googleapis.com/fcm/").addConverterFactory(JacksonConverterFactory.create()).build();
		service = retrofit.create(FCMService.class);
	}

	public PushNotificationResponse sendMulticast(final MulticastMessage multicastMessage) {
		try {
			Call<PushNotificationResponse> call = service.sendMulticast(apiServerKey, multicastMessage);
			Response<PushNotificationResponse> response = call.execute();
			PushNotificationResponse pushNotificationResponse = response.body();
			return pushNotificationResponse;
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}
	
	public PushNotificationResponse sendUnicast(final Message message) {
		try {
			Call<PushNotificationResponse> call = service.sendUnicast(apiServerKey, message);
			Response<PushNotificationResponse> response = call.execute();
			PushNotificationResponse pushNotificationResponse = response.body();
			return pushNotificationResponse;
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}
}
