package com.hl7integration.ws.Client;

import com.hl7integration.ws.Server.PatientService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;


public class Client {

    public static void main(String args[]) throws Exception {

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(PatientService.class);
        factory.setAddress("http://localhost:9999/patientService");
        PatientService ps = (PatientService) factory.create();

        String message = "MSH|^~\\&|hl7Integration|hl7Integration|||||ADT^A31|||2.5|\r" +
                "EVN|A31|20130617154644\r" +
                "PID|1|46530651||407623|Wood^Patrick^^^MR||19700101|1|||High Street^^Oxford|";

        //Call the service to register a patient
        ps.registerPatient(message);

        //Get the patient by nhs number
        System.out.println("Patient Surname is: " + ps.getPatientSurnameByNHSNumber(46530651));


    }
}
