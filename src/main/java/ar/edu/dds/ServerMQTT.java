package ar.edu.dds;

import ltg.commons.MessageListener;
import ltg.commons.SimpleMQTTClient;

public class ServerMQTT {

	public static void main(String[] args) {
        // Create a new client and connect to a broker
		SimpleMQTTClient sc = new SimpleMQTTClient("localhost");

        // Subscribe to a channel and register a callback for it
        sc.subscribe("myChannel", new MessageListener() {
            @Override
            public void processMessage(String message) {
                System.out.println(message);
            }
        });
    
        // Publish to a channel
        sc.publish("myChannel", "A message from me");
    
        while (!Thread.currentThread().isInterrupted()) {
        }
        
        // Unsubscribe from a channel
        sc.unsubscribe("myChannel");

        
        
		// Disconnect from broker
		sc.disconnect();

		// Do something else or the client will die...
       
	}
	
}
