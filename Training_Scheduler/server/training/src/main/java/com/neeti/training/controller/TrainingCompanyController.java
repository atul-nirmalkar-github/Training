package com.neeti.training.controller;

import com.neeti.training.bean.TrainingCompany;
import com.neeti.training.dto.CompanyDto;
import com.neeti.training.dto.GenericIdListDto;
import com.neeti.training.service.TrainingCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/company")
@CrossOrigin(origins = "http://localhost:3000")
public class TrainingCompanyController {

    @Autowired
    TrainingCompanyService trainingCompanyService;

    @GetMapping(produces = "application/json")
    public Iterable<TrainingCompany> getAllCompany(){
        return trainingCompanyService.getAllCompany();
    }

    @GetMapping(value = "/status/{status}", produces = "application/json")
    public Iterable<TrainingCompany> getAllCompanyByStatus(@PathVariable String status){
        return trainingCompanyService.getAllCompanyByStatus(status);
    }

    @GetMapping(value = "/{companyKey}", produces = "application/json")
    public TrainingCompany getCompanyById(@PathVariable String companyKey){
        UUID id = UUID.fromString(companyKey);
        return trainingCompanyService.getCompanyById(id);
    }

    @PostMapping(produces = "application/json")
    public TrainingCompany saveCompany(@RequestBody CompanyDto dto){
        TrainingCompany tempCompany = dtoToObject(dto);
        return trainingCompanyService.saveCompany(tempCompany);
    }

    @DeleteMapping(value = "/{companyKey}", produces = "application/json")
    public String deleteCompanyById(@PathVariable String companyKey){
        UUID id = UUID.fromString(companyKey);
        trainingCompanyService.deleteCompany(id);
        return companyKey;
    }

    @PostMapping(value = "/delete", produces = "application/json")
    public boolean deleteCompanyById(@RequestBody GenericIdListDto dto){
        trainingCompanyService.deleteAllCompany(dto.getIds());
        return true;
    }

    public TrainingCompany dtoToObject(CompanyDto dto){
        TrainingCompany company = new TrainingCompany();
        if(dto.getId()==null || dto.getId().isEmpty()){
            company.setName(dto.getCompanyName());
            company.setCompanyPhone(dto.getCompanyPhone());
            company.setContactName(dto.getContactName());
            company.setContactPhone(dto.getContactPhone());
            company.setCompanyAddress(dto.getCompanyAddress());
            company.setAddress("");
            company.setSubDomain("");
            company.setCountry("");
            company.setCity("");
            company.setPaymentType(0);
            company.setSubscriptionStartDate(LocalDateTime.now());
            company.setSubscriptionEndDate(LocalDateTime.now());
            company.setMaxEmployeesLimit(0);
            company.setCompanyCnr("");
            company.setOwnerName(dto.getContactName());
            company.setOwnerPhone(dto.getContactPhone());
            company.setBusinessType("");
            company.setParentVendor("");
            company.setProvince("");
            company.setMaxDevicesLimit(0);
            company.setMaxMobileApplicationsLimit(0);
            company.setMaxTransactionsLimit(0);
            company.setMaxWhatsappPushLimit(0);
            company.setParentVendorCompanyLogo("");
            company.setParentVendorSoftwareLogo("");
            company.setStatus("ACTIVE");
            company.setWhoCreated("Admin");
            company.setWhoModified("Admin");
            company.setWhenCreated(LocalDateTime.now());
            company.setWhenModified(LocalDateTime.now());
        }
        return company;
    }

}
