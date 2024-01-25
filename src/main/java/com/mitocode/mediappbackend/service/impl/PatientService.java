package com.mitocode.mediappbackend.service.impl;

import com.mitocode.mediappbackend.model.Patient;
import com.mitocode.mediappbackend.repo.IGenericRepo;
import com.mitocode.mediappbackend.repo.IPatientRepo;
import com.mitocode.mediappbackend.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService extends CrudImpl<Patient, Integer> implements IPatientService {

    private final IPatientRepo repo;


    @Override
    protected IGenericRepo<Patient, Integer> getRepo() {
        return repo;
    }
}
