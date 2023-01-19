package com.xeTraining.wizardInfoservice.service;

import com.xeTraining.wizardInfoservice.entity.WizardInfo;
import com.xeTraining.wizardInfoservice.repository.WizardInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WizardInfoService {

    @Autowired
    WizardInfoRepository repository;

    public List<WizardInfo> getWizardInfo(){
        return repository.findAll();
    }

    public WizardInfo addWizardInfo(WizardInfo wizardInfo){
        return repository.save(wizardInfo);
    }

    public void deleteWizardInfo(Long id){
        repository.findById(id).orElseThrow(
                () -> new RuntimeException("Not found")
        );
        repository.deleteById(id);
    }

    public WizardInfo updateWizardInfo(WizardInfo wizardInfo){
        repository.findById(wizardInfo.getId()).orElseThrow(
                () -> new RuntimeException("Not found")
        );
        return repository.save(wizardInfo);
    }
}
