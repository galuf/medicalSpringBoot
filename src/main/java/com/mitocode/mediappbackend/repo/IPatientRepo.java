package com.mitocode.mediappbackend.repo;

import com.mitocode.mediappbackend.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepo extends IGenericRepo<Patient, Integer> {

    //Patient sayHello(Patient patient);

}
