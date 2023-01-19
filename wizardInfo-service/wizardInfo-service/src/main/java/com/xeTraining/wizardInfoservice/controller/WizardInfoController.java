package com.xeTraining.wizardInfoservice.controller;

import com.xeTraining.wizardInfoservice.entity.WizardInfo;
import com.xeTraining.wizardInfoservice.service.WizardInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class WizardInfoController {

//    @Autowired
//    private WizardInfoRepository wizardInfoRepository;

    @Autowired
    WizardInfoService service;

    private WizardInfo wizardInfo = new WizardInfo();


    @GetMapping("/wizardInfoList")
    public List<WizardInfo> getList(){
        return service.getWizardInfo();
    }

    @PostMapping("/add")
    public WizardInfo createWizardInfo(@RequestBody WizardInfo wizardInfo) {
        return service.addWizardInfo(wizardInfo);
        //return wizardInfoRepository.save(wizardInfo);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteWizardInfo(@PathVariable(value = "id")long id){
        service.deleteWizardInfo(id);
        //wizardInfoRepository.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public WizardInfo updateWizardInfo(@RequestBody WizardInfo wizardInfo){
        return service.updateWizardInfo(wizardInfo);
    }
}
