package com.hl7integration.ws.Client;

import com.hl7integration.ws.Server.HelloWorld;
import com.hl7integration.ws.Server.IHelloWorld;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

/**
 * Created with IntelliJ IDEA.
 * User: suay
 * Date: 10/10/13
 * Time: 1:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Client {

    private static final QName SERVICE_NAME
            = new QName("http://com.hl7integration.ws.Server/", "IHelloWorld");
    private static final QName PORT_NAME
            = new QName("http://com.hl7integration.ws.Server/", "IHelloWorldPort");


    private Client() {
    }

    public static void main(String args[]) throws Exception {

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IHelloWorld.class);
        factory.setAddress("http://localhost:9999/helloWorld");
        IHelloWorld hw = (IHelloWorld) factory.create();
        System.out.println(hw.sayHi("World"));


    }
}
