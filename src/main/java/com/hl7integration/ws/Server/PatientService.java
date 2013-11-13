package com.hl7integration.ws.Server;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;

import javax.jws.WebService;


@WebService
public interface PatientService {

    /**
     * This method registers a new  Patient
     * @param message HL7 message which contains Patient details
     */
    void registerPatient(String message);

    /**
     * Thei method obtains the surname for a given patient id
     * @param nhsNumber Id of the Patient
     * @return Surname of the Patient
     */
    String getPatientSurnameByNHSNumber(int nhsNumber);
}
