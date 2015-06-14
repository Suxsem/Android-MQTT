package com.suxsem.mqtt;

import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * Created by Stefano on 23/02/2015.
 */

public class MqttClientPing extends MqttClient {
    public MqttClientPing(String serverURI, String clientId, MqttClientPersistence persistence, MqttPingSender pingSender) throws MqttException {
        super(serverURI, clientId, persistence);
        aClient = new MqttAsyncClient(serverURI, clientId, persistence, pingSender);
    }
}