package com.hl7integration.ws.Server;

import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 * User: suay
 * Date: 10/10/13
 * Time: 1:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Server {

    protected Server() throws Exception {
        // START SNIPPET: publish
        System.out.println("Starting Server");
        HelloWorld implementor = new HelloWorld();
        String address = "http://localhost:9999/helloWorld";
        Endpoint.publish(address, implementor);
        // END SNIPPET: publish
    }

    public static void main(String args[]) throws Exception {
        new Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
