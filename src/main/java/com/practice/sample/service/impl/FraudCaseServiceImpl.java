package com.practice.sample.service.impl;

import com.practice.sample.entity.Case;
import com.practice.sample.model.request.FraudCaseIntakeRequestDto;
import com.practice.sample.repo.CaseRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraudCaseServiceImpl {

    @Autowired
    private CaseRepository repo;

    @Autowired
    private ModelMapper modelMapper;

    // insert / update case

    private void addCase(FraudCaseIntakeRequestDto intakeRequestDto){
        }

    // find case by id


    // retrieve all cases
    //private List<FraudCaseIntakeRequestDto> fetchAllCases() ;

    // delete case by id


    // model<->entity conversion
    private List<Case> modelToEntity(FraudCaseIntakeRequestDto fraudCaseIntakeRequestDto){
        return (List<Case>) modelMapper.map(fraudCaseIntakeRequestDto, Case.class);
    }
    private FraudCaseIntakeRequestDto entityToModel(Case caseEntity){
        FraudCaseIntakeRequestDto intakeRequestDto = modelMapper.map(caseEntity, FraudCaseIntakeRequestDto.class);
        return intakeRequestDto;
    }


}
