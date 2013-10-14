package com.hl7integration.ws.Server;

import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: suay
 * Date: 10/10/13
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface IHelloWorld {
    String sayHi(String text);

}
