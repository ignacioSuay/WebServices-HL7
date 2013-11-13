package com.hl7integration.ws.Server;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.PipeParser;
import ca.uhn.hl7v2.util.Terser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;


@WebService(endpointInterface = "com.hl7integration.ws.Server.PatientService",
        serviceName = "PatientService")
public class PatientServiceImpl implements PatientService {

    private static final Logger log     = LoggerFactory.getLogger(PatientServiceImpl.class);

    private List<Patient> patients;

    public PatientServiceImpl() {
        this.patients =  new ArrayList<Patient>();
    }

    public void registerPatient(String message) {
        int res = 0;
        try{

            PipeParser pipeParser = new PipeParser();
            Message m = pipeParser.parse(message);
            Terser terser = new Terser(m);

            String surname = terser.get("/PID-5-1");
            String  name= terser.get("/PID-5-2");
            int nhsNumber = Integer.parseInt(terser.get("/PID-2"));

            Patient p = new Patient(name, surname, nhsNumber);
            patients.add(p);

       }catch(Exception e){
          e.printStackTrace();
          log.error("Cannot register a patient");
       }
    }

    public String getPatientSurnameByNHSNumber(int nhsNumber) {

        try{

            for(Patient p : patients){
                if(nhsNumber == p.getNhsNumber()){
                    return p.getSurname();
                }
            }

        }catch(Exception e){
            log.error("Cannot get patient's surname");
        }
        return null;
    }
}
