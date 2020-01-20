package com.sil.fcmclient;

import java.util.ArrayList;

import com.sil.fcmclient.multicast.model.Data;
import com.sil.fcmclient.multicast.model.MulticastMessage;
import com.sil.fcmclient.multicast.model.MulticastNotification;
import com.sil.fcmclient.response.model.PushNotificationResponse;
import com.sil.fcmclient.unicast.model.Message;
import com.sil.fcmclient.unicast.model.UnicastNotification;

public class Main {

	public static void multicastTest() {
		FireMessagingService service = new FireMessagingService("AAAAXdHjdX8:APA91bF-zrkBowcR8C0eENHfYtfv1AcPaSxtyPiuvi3P22pzYOJXvpioKD2m8-DVXIVdjmiV05vzJwFpwlJWh6N6_ntsROWuBgaYWxl7vUKre5DgQalAkAtkdFnxYRiftm-1ER-J_ohi");
		String deviceId = "cEMOI7N4YTU:APA91bGuP2Ea5x1oxQdmAA2RCwix7cusyEXX1jfNpo-zWAW61xQzAv1XqW8bL1jIKBU17gIjmJzItrv770YCnms4rgyhvK2IRF1f2W6cWzGaWIWc6KEEFQOLD3IgnuLjJT0F-WlBHahb";
		MulticastNotification multicastNotification = new com.sil.fcmclient.multicast.model.MulticastNotification("Notificatoin Title", "Hello Test notification");
		ArrayList<String> list = new ArrayList<>();
		list.add(deviceId);
		list.add("dWpsT9nVxUM:APA91bG1qanXIji5NyQb5s73hs0Bp1s2A3tnwn-R0fxew_dvrV-UVAszrz5jjuYGtD8OvGg6n_Rl44Ko23CyigMcNLot6oY82ovy98l9lOXEAAXejeKFPqUYAF2Qkw7CPkf3UES_oMMc");
		Data data = new Data("Hi There");
		MulticastMessage multicastMessage = new MulticastMessage(list, data, multicastNotification);
		PushNotificationResponse response = service.sendMulticast(multicastMessage);
		System.out.println("response : " + response);
	}

	public static void unicastTest() {
		FireMessagingService service = new FireMessagingService("AAAAXdHjdX8:APA91bF-zrkBowcR8C0eENHfYtfv1AcPaSxtyPiuvi3P22pzYOJXvpioKD2m8-DVXIVdjmiV05vzJwFpwlJWh6N6_ntsROWuBgaYWxl7vUKre5DgQalAkAtkdFnxYRiftm-1ER-J_ohi");
		String deviceId = "dWpsT9nVxUM:APA91bG1qanXIji5NyQb5s73hs0Bp1s2A3tnwn-R0fxew_dvrV-UVAszrz5jjuYGtD8OvGg6n_Rl44Ko23CyigMcNLot6oY82ovy98l9lOXEAAXejeKFPqUYAF2Qkw7CPkf3UES_oMMc";
		UnicastNotification notification = new UnicastNotification("Notificatoin Title", "Hello Test notification");
		Message message = new Message(deviceId, notification);
		PushNotificationResponse response = service.sendUnicast(message);
		System.out.println("response : " + response);
	}

	public static void main(String[] args) {
		 unicastTest();
		//multicastTest();
	}
}
