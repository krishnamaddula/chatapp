package com.maddula.p2p.chat.app;

import com.maddula.p2p.chat.client.devices.DeviceControllerVerticle;
import com.maddula.p2p.chat.server.ChatControllerVerticle;

import io.vertx.core.AbstractVerticle;

public class App extends AbstractVerticle {
	@Override
	public void start() throws Exception {
		vertx.deployVerticle(new ChatControllerVerticle());
		Thread.sleep(1000);
		vertx.deployVerticle(new DeviceControllerVerticle());
	}
}