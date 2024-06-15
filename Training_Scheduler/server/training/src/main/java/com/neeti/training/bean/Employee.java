package com.neeti.training.bean;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "training_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "emp_code")
    private String empCode;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "passport")
    private String passport;

    @Column(name = "aadhar")
    private String aaddhar;

    @Column(name = "driver_license_automobile")
    private String driverLicenseAutomobile;

    @Column(name = "driver_license_motorcycle")
    private String driverLicenseMotorcycle;

    @Column(name = "enable_outdoor_management")
    private int enableOutdoorManagement;

    @Column(name = "photo")
    private String photo;

    @Column(name = "self_password")
    private String selfPassword;

    @Column(name = "device_password")
    private String devicePassword;

    @Column(name = "dev_privilege")
    private int devPrivilege;

    @Column(name = "card_no")
    private String cardNo;

    @Column(name = "acc_group")
    private String accGroup;

    @Column(name = "acc_timezone")
    private String accTimeZone;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "address")
    private String address;

    @Column(name = "area")
    private String area;

    @Column(name = "post_code")
    private String postCode;

    @Column(name = "office_tel")
    private String officeTel;

    @Column(name = "contact_tel")
    private String contactTel;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "national")
    private String national;

    @Column(name = "religion")
    private String religion;

    @Column(name = "title")
    private String title;

    @Column(name = "enroll_sn")
    private String enrollSn;

    @Column(name = "ssn")
    private String ssn;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    @Column(name = "hire_date")
    private LocalDateTime hireDate;

    @Column(name = "verify_mode")
    private int verifyMode;

    @Column(name = "city")
    private String city;

    @Column(name = "is_admin")
    private Boolean isAdmin;

    @Column(name = "emp_type")
    private int empType;

    @Column(name = "enable_att")
    private Boolean enableAtt;

    @Column(name = "enable_payroll")
    private Boolean enablePayroll;

    @Column(name = "enable_overtime")
    private Boolean enableOvertime;

    @Column(name = "enable_holiday")
    private Boolean enableHoliday;

    @Column(name = "holiday_location")
    private String holidayLocation;

    @Column(name = "enable_whatsapp")
    private Boolean enableWhatsapp;

    @Column(name = "whatsapp_exception")
    private Boolean whatsappException;

    @Column(name = "whatsapp_punch")
    private Boolean whatsappPunch;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "reserved")
    private int reserved;

    @Column(name = "del_tag")
    private int delTag;

    @Column(name = "app_status")
    private int appStatus;

    @Column(name = "app_role")
    private int appRole;

    @Column(name = "email")
    private String email;

    @Column(name = "enable_sms")
    private Boolean enableSms;

    @Column(name = "sms_exception")
    private Boolean smsException;

    @Column(name = "sms_punch")
    private Boolean smsPunch;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "location_id")
    private int locationId;

    @Column(name = "position_id")
    private int positionId;

    @Column(name = "company_id")
    private UUID companyId;

    @Column(name = "otp")
    private String otp;

    @Column(name = "verified_employee")
    private int verifiedEmployee;

    @Column(name = "app_punch_status")
    private int appPunchStatus;

    @Column(name = "status")
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

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getDriverLicenseAutomobile() {
        return driverLicenseAutomobile;
    }

    public void setDriverLicenseAutomobile(String driverLicenseAutomobile) {
        this.driverLicenseAutomobile = driverLicenseAutomobile;
    }

    public String getDriverLicenseMotorcycle() {
        return driverLicenseMotorcycle;
    }

    public void setDriverLicenseMotorcycle(String driverLicenseMotorcycle) {
        this.driverLicenseMotorcycle = driverLicenseMotorcycle;
    }

    public int getEnableOutdoorManagement() {
        return enableOutdoorManagement;
    }

    public void setEnableOutdoorManagement(int enableOutdoorManagement) {
        this.enableOutdoorManagement = enableOutdoorManagement;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSelfPassword() {
        return selfPassword;
    }

    public void setSelfPassword(String selfPassword) {
        this.selfPassword = selfPassword;
    }

    public String getDevicePassword() {
        return devicePassword;
    }

    public void setDevicePassword(String devicePassword) {
        this.devicePassword = devicePassword;
    }

    public int getDevPrivilege() {
        return devPrivilege;
    }

    public void setDevPrivilege(int devPrivilege) {
        this.devPrivilege = devPrivilege;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getAccGroup() {
        return accGroup;
    }

    public void setAccGroup(String accGroup) {
        this.accGroup = accGroup;
    }

    public String getAccTimeZone() {
        return accTimeZone;
    }

    public void setAccTimeZone(String accTimeZone) {
        this.accTimeZone = accTimeZone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getOfficeTel() {
        return officeTel;
    }

    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEnrollSn() {
        return enrollSn;
    }

    public void setEnrollSn(String enrollSn) {
        this.enrollSn = enrollSn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
    }

    public int getVerifyMode() {
        return verifyMode;
    }

    public void setVerifyMode(int verifyMode) {
        this.verifyMode = verifyMode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public int getEmpType() {
        return empType;
    }

    public void setEmpType(int empType) {
        this.empType = empType;
    }

    public Boolean getEnableAtt() {
        return enableAtt;
    }

    public void setEnableAtt(Boolean enableAtt) {
        this.enableAtt = enableAtt;
    }

    public Boolean getEnablePayroll() {
        return enablePayroll;
    }

    public void setEnablePayroll(Boolean enablePayroll) {
        this.enablePayroll = enablePayroll;
    }

    public Boolean getEnableOvertime() {
        return enableOvertime;
    }

    public void setEnableOvertime(Boolean enableOvertime) {
        this.enableOvertime = enableOvertime;
    }

    public Boolean getEnableHoliday() {
        return enableHoliday;
    }

    public void setEnableHoliday(Boolean enableHoliday) {
        this.enableHoliday = enableHoliday;
    }

    public Boolean getEnableWhatsapp() {
        return enableWhatsapp;
    }

    public void setEnableWhatsapp(Boolean enableWhatsapp) {
        this.enableWhatsapp = enableWhatsapp;
    }

    public Boolean getWhatsappException() {
        return whatsappException;
    }

    public void setWhatsappException(Boolean whatsappException) {
        this.whatsappException = whatsappException;
    }

    public Boolean getWhatsappPunch() {
        return whatsappPunch;
    }

    public void setWhatsappPunch(Boolean whatsappPunch) {
        this.whatsappPunch = whatsappPunch;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public int getReserved() {
        return reserved;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }

    public int getDelTag() {
        return delTag;
    }

    public void setDelTag(int delTag) {
        this.delTag = delTag;
    }

    public int getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(int appStatus) {
        this.appStatus = appStatus;
    }

    public int getAppRole() {
        return appRole;
    }

    public void setAppRole(int appRole) {
        this.appRole = appRole;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEnableSms() {
        return enableSms;
    }

    public void setEnableSms(Boolean enableSms) {
        this.enableSms = enableSms;
    }

    public Boolean getSmsException() {
        return smsException;
    }

    public void setSmsException(Boolean smsException) {
        this.smsException = smsException;
    }

    public Boolean getSmsPunch() {
        return smsPunch;
    }

    public void setSmsPunch(Boolean smsPunch) {
        this.smsPunch = smsPunch;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public int getVerifiedEmployee() {
        return verifiedEmployee;
    }

    public void setVerifiedEmployee(int verifiedEmployee) {
        this.verifiedEmployee = verifiedEmployee;
    }

    public int getAppPunchStatus() {
        return appPunchStatus;
    }

    public void setAppPunchStatus(int appPunchStatus) {
        this.appPunchStatus = appPunchStatus;
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

    public String getAaddhar() {
        return aaddhar;
    }

    public void setAaddhar(String aaddhar) {
        this.aaddhar = aaddhar;
    }

    public String getHolidayLocation() {
        return holidayLocation;
    }

    public void setHolidayLocation(String holidayLocation) {
        this.holidayLocation = holidayLocation;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
