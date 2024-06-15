package com.neeti.training.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

public class EmployeeDto {
    private String id;
    private String empCode;
    private String firstName;
    private String lastName;
    private String nickName;
    private String passport;
    private String aaddhar;
    private String driverLicenseAutomobile;
    private String driverLicenseMotorcycle;
    private int enableOutdoorManagement;
    private String photo;
    private String selfPassword;
    private String devicePassword;
    private int devPrivilege;
    private String cardNo;
    private String accGroup;
    private String accTimeZone;
    private String gender;
    private String birthday;
    private String address;
    private String area;
    private String postCode;
    private String officeTel;
    private String contactTel;
    private String mobile;
    private String national;
    private String religion;
    private String title;
    private String enrollSn;
    private String ssn;
    private LocalDateTime updateTime;
    private String hireDate;
    private int verifyMode;
    private String city;
    private Boolean isAdmin;
    private int empType;
    private Boolean enableAtt;
    private Boolean enablePayroll;
    private Boolean enableOvertime;
    private Boolean enableHoliday;
    private String holidayLocation;
    private Boolean enableWhatsapp;
    private Boolean whatsappException;
    private Boolean whatsappPunch;
    private Boolean deleted;
    private int reserved;
    private int delTag;
    private int appStatus;
    private int appRole;
    private String email;
    private Boolean enableSms;
    private Boolean smsException;
    private Boolean smsPunch;
    private LocalDateTime lastLogin;
    private Boolean isActive;
    private int departmentId;
    private String departmentName;
    private int locationId;
    private int positionId;
    private String companyId;
    private String companyName;
    private String otp;
    private int verifiedEmployee;
    private int appPunchStatus;
    private String status;
    private String whoCreated;
    private LocalDateTime whenCreated;
    private String whoModified;
    private LocalDateTime whenModified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getWhenModified() {
        return whenModified;
    }

    public void setWhenModified(LocalDateTime whenModified) {
        this.whenModified = whenModified;
    }

    public String getWhoModified() {
        return whoModified;
    }

    public void setWhoModified(String whoModified) {
        this.whoModified = whoModified;
    }

    public LocalDateTime getWhenCreated() {
        return whenCreated;
    }

    public void setWhenCreated(LocalDateTime whenCreated) {
        this.whenCreated = whenCreated;
    }

    public String getWhoCreated() {
        return whoCreated;
    }

    public void setWhoCreated(String whoCreated) {
        this.whoCreated = whoCreated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAppPunchStatus() {
        return appPunchStatus;
    }

    public void setAppPunchStatus(int appPunchStatus) {
        this.appPunchStatus = appPunchStatus;
    }

    public int getVerifiedEmployee() {
        return verifiedEmployee;
    }

    public void setVerifiedEmployee(int verifiedEmployee) {
        this.verifiedEmployee = verifiedEmployee;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Boolean getSmsPunch() {
        return smsPunch;
    }

    public void setSmsPunch(Boolean smsPunch) {
        this.smsPunch = smsPunch;
    }

    public Boolean getSmsException() {
        return smsException;
    }

    public void setSmsException(Boolean smsException) {
        this.smsException = smsException;
    }

    public Boolean getEnableSms() {
        return enableSms;
    }

    public void setEnableSms(Boolean enableSms) {
        this.enableSms = enableSms;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAppRole() {
        return appRole;
    }

    public void setAppRole(int appRole) {
        this.appRole = appRole;
    }

    public int getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(int appStatus) {
        this.appStatus = appStatus;
    }

    public int getDelTag() {
        return delTag;
    }

    public void setDelTag(int delTag) {
        this.delTag = delTag;
    }

    public int getReserved() {
        return reserved;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getWhatsappPunch() {
        return whatsappPunch;
    }

    public void setWhatsappPunch(Boolean whatsappPunch) {
        this.whatsappPunch = whatsappPunch;
    }

    public Boolean getWhatsappException() {
        return whatsappException;
    }

    public void setWhatsappException(Boolean whatsappException) {
        this.whatsappException = whatsappException;
    }

    public Boolean getEnableWhatsapp() {
        return enableWhatsapp;
    }

    public void setEnableWhatsapp(Boolean enableWhatsapp) {
        this.enableWhatsapp = enableWhatsapp;
    }

    public String getHolidayLocation() {
        return holidayLocation;
    }

    public void setHolidayLocation(String holidayLocation) {
        this.holidayLocation = holidayLocation;
    }

    public Boolean getEnableHoliday() {
        return enableHoliday;
    }

    public void setEnableHoliday(Boolean enableHoliday) {
        this.enableHoliday = enableHoliday;
    }

    public Boolean getEnableOvertime() {
        return enableOvertime;
    }

    public void setEnableOvertime(Boolean enableOvertime) {
        this.enableOvertime = enableOvertime;
    }

    public Boolean getEnablePayroll() {
        return enablePayroll;
    }

    public void setEnablePayroll(Boolean enablePayroll) {
        this.enablePayroll = enablePayroll;
    }

    public Boolean getEnableAtt() {
        return enableAtt;
    }

    public void setEnableAtt(Boolean enableAtt) {
        this.enableAtt = enableAtt;
    }

    public int getEmpType() {
        return empType;
    }

    public void setEmpType(int empType) {
        this.empType = empType;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getVerifyMode() {
        return verifyMode;
    }

    public void setVerifyMode(int verifyMode) {
        this.verifyMode = verifyMode;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEnrollSn() {
        return enrollSn;
    }

    public void setEnrollSn(String enrollSn) {
        this.enrollSn = enrollSn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getOfficeTel() {
        return officeTel;
    }

    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAccTimeZone() {
        return accTimeZone;
    }

    public void setAccTimeZone(String accTimeZone) {
        this.accTimeZone = accTimeZone;
    }

    public String getAccGroup() {
        return accGroup;
    }

    public void setAccGroup(String accGroup) {
        this.accGroup = accGroup;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getDevPrivilege() {
        return devPrivilege;
    }

    public void setDevPrivilege(int devPrivilege) {
        this.devPrivilege = devPrivilege;
    }

    public String getDevicePassword() {
        return devicePassword;
    }

    public void setDevicePassword(String devicePassword) {
        this.devicePassword = devicePassword;
    }

    public String getSelfPassword() {
        return selfPassword;
    }

    public void setSelfPassword(String selfPassword) {
        this.selfPassword = selfPassword;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getEnableOutdoorManagement() {
        return enableOutdoorManagement;
    }

    public void setEnableOutdoorManagement(int enableOutdoorManagement) {
        this.enableOutdoorManagement = enableOutdoorManagement;
    }

    public String getDriverLicenseMotorcycle() {
        return driverLicenseMotorcycle;
    }

    public void setDriverLicenseMotorcycle(String driverLicenseMotorcycle) {
        this.driverLicenseMotorcycle = driverLicenseMotorcycle;
    }

    public String getDriverLicenseAutomobile() {
        return driverLicenseAutomobile;
    }

    public void setDriverLicenseAutomobile(String driverLicenseAutomobile) {
        this.driverLicenseAutomobile = driverLicenseAutomobile;
    }

    public String getAaddhar() {
        return aaddhar;
    }

    public void setAaddhar(String aaddhar) {
        this.aaddhar = aaddhar;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }
}
