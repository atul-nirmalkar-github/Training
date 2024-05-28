package com.neeti.training.bean;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="training_company")
public class TrainingCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name",nullable = true)
    private String name;

    @Column(name = "sub_domain",nullable = true)
    private String subDomain;

    @Column(name = "address_1",nullable = true)
    private String address;

    @Column(name = "country",nullable = true)
    private String country;

    @Column(name = "city",nullable = true)
    private String city;

    @Column(name = "payment_type",nullable = true)
    private Integer paymentType;

    @Column(name = "subscription_start_date",nullable = true)
    private LocalDateTime subscriptionStartDate;

    @Column(name = "subscription_end_date",nullable = true)
    private LocalDateTime subscriptionEndDate;

    @Column(name = "max_employees_limit",nullable = true)
    private Integer maxEmployeesLimit;

    @Column(name = "company_address",nullable = true)
    private String companyAddress;

    @Column(name = "company_phone",nullable = true)
    private String companyPhone;

    @Column(name = "company_cnr",nullable = true)
    private String companyCnr;

    @Column(name = "owner_name",nullable = true)
    private String ownerName;

    @Column(name = "owner_phone",nullable = true)
    private String ownerPhone;

    @Column(name = "contact_name",nullable = true)
    private String contactName;

    @Column(name = "contact_phone",nullable = true)
    private String contactPhone;

    @Column(name = "business_type",nullable = true)
    private String businessType;

    @Column(name = "parent_vendor",nullable = true)
    private String parentVendor;

    @Column(name = "province",nullable = true)
    private String province;

    @Column(name = "max_devices_limit",nullable = true)
    private Integer maxDevicesLimit;

    @Column(name = "max_mobile_applications_limit",nullable = true)
    private Integer maxMobileApplicationsLimit;

    @Column(name = "max_transactions_limit",nullable = true)
    private Integer maxTransactionsLimit;

    @Column(name = "max_whatsapp_push_limit",nullable = true)
    private Integer maxWhatsappPushLimit;

    @Column(name = "parent_vendor_company_logo",nullable = true)
    private String parentVendorCompanyLogo;

    @Column(name = "parent_vendor_software_logo",nullable = true)
    private String parentVendorSoftwareLogo;

    @Column(name = "status",nullable = true)
    private String status;

    @Column(name = "whoCreated")
    private String whoCreated;

    @Column(name = "whenCreated")
    private LocalDateTime whenCreated;

    @Column(name = "whoModified")
    private String whoModified;

    @Column(name = "whenModified")
    private LocalDateTime whenModified;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubDomain() {
        return subDomain;
    }

    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public LocalDateTime getSubscriptionStartDate() {
        return subscriptionStartDate;
    }

    public void setSubscriptionStartDate(LocalDateTime subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }

    public LocalDateTime getSubscriptionEndDate() {
        return subscriptionEndDate;
    }

    public void setSubscriptionEndDate(LocalDateTime subscriptionEndDate) {
        this.subscriptionEndDate = subscriptionEndDate;
    }

    public Integer getMaxEmployeesLimit() {
        return maxEmployeesLimit;
    }

    public void setMaxEmployeesLimit(Integer maxEmployeesLimit) {
        this.maxEmployeesLimit = maxEmployeesLimit;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyCnr() {
        return companyCnr;
    }

    public void setCompanyCnr(String companyCnr) {
        this.companyCnr = companyCnr;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getParentVendor() {
        return parentVendor;
    }

    public void setParentVendor(String parentVendor) {
        this.parentVendor = parentVendor;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getMaxDevicesLimit() {
        return maxDevicesLimit;
    }

    public void setMaxDevicesLimit(Integer maxDevicesLimit) {
        this.maxDevicesLimit = maxDevicesLimit;
    }

    public Integer getMaxMobileApplicationsLimit() {
        return maxMobileApplicationsLimit;
    }

    public void setMaxMobileApplicationsLimit(Integer maxMobileApplicationsLimit) {
        this.maxMobileApplicationsLimit = maxMobileApplicationsLimit;
    }

    public Integer getMaxTransactionsLimit() {
        return maxTransactionsLimit;
    }

    public void setMaxTransactionsLimit(Integer maxTransactionsLimit) {
        this.maxTransactionsLimit = maxTransactionsLimit;
    }

    public Integer getMaxWhatsappPushLimit() {
        return maxWhatsappPushLimit;
    }

    public void setMaxWhatsappPushLimit(Integer maxWhatsappPushLimit) {
        this.maxWhatsappPushLimit = maxWhatsappPushLimit;
    }

    public String getParentVendorCompanyLogo() {
        return parentVendorCompanyLogo;
    }

    public void setParentVendorCompanyLogo(String parentVendorCompanyLogo) {
        this.parentVendorCompanyLogo = parentVendorCompanyLogo;
    }

    public String getParentVendorSoftwareLogo() {
        return parentVendorSoftwareLogo;
    }

    public void setParentVendorSoftwareLogo(String parentVendorSoftwareLogo) {
        this.parentVendorSoftwareLogo = parentVendorSoftwareLogo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWhoCreated() {
        return whoCreated;
    }

    public void setWhoCreated(String whoCreated) {
        this.whoCreated = whoCreated;
    }

    public LocalDateTime getWhenCreated() {
        return whenCreated;
    }

    public void setWhenCreated(LocalDateTime whenCreated) {
        this.whenCreated = whenCreated;
    }

    public String getWhoModified() {
        return whoModified;
    }

    public void setWhoModified(String whoModified) {
        this.whoModified = whoModified;
    }

    public LocalDateTime getWhenModified() {
        return whenModified;
    }

    public void setWhenModified(LocalDateTime whenModified) {
        this.whenModified = whenModified;
    }
}
