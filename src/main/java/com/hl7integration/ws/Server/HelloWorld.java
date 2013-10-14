package com.hl7integration.ws.Server;

import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: suay
 * Date: 10/10/13
 * Time: 1:21 PM
 * To change this template use File | Settings | File Templates.
 */

@WebService(endpointInterface = "com.hl7integration.ws.Server.IHelloWorld",
                serviceName = "IHelloWorld")
public class HelloWorld implements IHelloWorld {

    public String sayHi(String text) {
        	        System.out.println("sayHi called");
        	        return "Hello " + text;
        	    }
}
