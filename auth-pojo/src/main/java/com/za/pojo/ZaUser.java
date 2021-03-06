package com.za.pojo;

import java.io.Serializable;
import java.util.Date;

public class ZaUser implements Serializable {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.USER_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.CODE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.LOGIN_NAME
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String loginName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.NAME
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.ORGANIZE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String organizeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.REPORT_TO_USER_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Integer reportToUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.CERTIFI_TYPE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Integer certifiTypeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.CERTIFI_CODE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String certifiCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.PASSWORD
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.ALLOW_CHANGE_PASSWORD
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String allowChangePassword;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.WORK_TYPE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Integer workTypeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.USER_TYPE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Integer userTypeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.CHECK_FLAG
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String checkFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.EDUCATION_TYPE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Integer educationTypeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.HOME_TEL
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String homeTel;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.OFFICE_TEL
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String officeTel;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.MOBILE_TELE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String mobileTele;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.ADDR_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String addrId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.EMAIL
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.CREATE_DATE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Date createDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.EFFECT_DATE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Date effectDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.EXPIRE_DATE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Date expireDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.MULTI_LOGIN_FLAG
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Short multiLoginFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.LAST_LOGIN_LOG_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Long lastLoginLogId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.TRY_TIMES
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Long tryTimes;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.LOCK_FLAG
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String lockFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.IS_LOGIN
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String isLogin;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.STATE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String state;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.CREATOR
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String creator;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.CREATE_TIME
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.MODIFIER
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String modifier;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.MODIFY_TIME
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Date modifyTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.REC_VER
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private Long recVer;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.QQ
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String qq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.ICON
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String icon;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.ICON_SMALL
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String iconSmall;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.MSN
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String msn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.ONLINE_STATUS
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String onlineStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.UNITS_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String unitsId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.ISSENDMSG
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String issendmsg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.TENANT_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String tenantId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column za_user.REMARKS
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	private String remarks;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.USER_ID
	 * @return  the value of za_user.USER_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.USER_ID
	 * @param userId  the value for za_user.USER_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.CODE
	 * @return  the value of za_user.CODE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.CODE
	 * @param code  the value for za_user.CODE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.LOGIN_NAME
	 * @return  the value of za_user.LOGIN_NAME
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.LOGIN_NAME
	 * @param loginName  the value for za_user.LOGIN_NAME
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.NAME
	 * @return  the value of za_user.NAME
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.NAME
	 * @param name  the value for za_user.NAME
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.ORGANIZE_ID
	 * @return  the value of za_user.ORGANIZE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getOrganizeId() {
		return organizeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.ORGANIZE_ID
	 * @param organizeId  the value for za_user.ORGANIZE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setOrganizeId(String organizeId) {
		this.organizeId = organizeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.REPORT_TO_USER_ID
	 * @return  the value of za_user.REPORT_TO_USER_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Integer getReportToUserId() {
		return reportToUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.REPORT_TO_USER_ID
	 * @param reportToUserId  the value for za_user.REPORT_TO_USER_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setReportToUserId(Integer reportToUserId) {
		this.reportToUserId = reportToUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.CERTIFI_TYPE_ID
	 * @return  the value of za_user.CERTIFI_TYPE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Integer getCertifiTypeId() {
		return certifiTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.CERTIFI_TYPE_ID
	 * @param certifiTypeId  the value for za_user.CERTIFI_TYPE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setCertifiTypeId(Integer certifiTypeId) {
		this.certifiTypeId = certifiTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.CERTIFI_CODE
	 * @return  the value of za_user.CERTIFI_CODE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getCertifiCode() {
		return certifiCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.CERTIFI_CODE
	 * @param certifiCode  the value for za_user.CERTIFI_CODE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setCertifiCode(String certifiCode) {
		this.certifiCode = certifiCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.PASSWORD
	 * @return  the value of za_user.PASSWORD
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.PASSWORD
	 * @param password  the value for za_user.PASSWORD
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.ALLOW_CHANGE_PASSWORD
	 * @return  the value of za_user.ALLOW_CHANGE_PASSWORD
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getAllowChangePassword() {
		return allowChangePassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.ALLOW_CHANGE_PASSWORD
	 * @param allowChangePassword  the value for za_user.ALLOW_CHANGE_PASSWORD
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setAllowChangePassword(String allowChangePassword) {
		this.allowChangePassword = allowChangePassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.WORK_TYPE_ID
	 * @return  the value of za_user.WORK_TYPE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Integer getWorkTypeId() {
		return workTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.WORK_TYPE_ID
	 * @param workTypeId  the value for za_user.WORK_TYPE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setWorkTypeId(Integer workTypeId) {
		this.workTypeId = workTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.USER_TYPE_ID
	 * @return  the value of za_user.USER_TYPE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Integer getUserTypeId() {
		return userTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.USER_TYPE_ID
	 * @param userTypeId  the value for za_user.USER_TYPE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.CHECK_FLAG
	 * @return  the value of za_user.CHECK_FLAG
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getCheckFlag() {
		return checkFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.CHECK_FLAG
	 * @param checkFlag  the value for za_user.CHECK_FLAG
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setCheckFlag(String checkFlag) {
		this.checkFlag = checkFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.EDUCATION_TYPE_ID
	 * @return  the value of za_user.EDUCATION_TYPE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Integer getEducationTypeId() {
		return educationTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.EDUCATION_TYPE_ID
	 * @param educationTypeId  the value for za_user.EDUCATION_TYPE_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setEducationTypeId(Integer educationTypeId) {
		this.educationTypeId = educationTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.HOME_TEL
	 * @return  the value of za_user.HOME_TEL
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getHomeTel() {
		return homeTel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.HOME_TEL
	 * @param homeTel  the value for za_user.HOME_TEL
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.OFFICE_TEL
	 * @return  the value of za_user.OFFICE_TEL
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getOfficeTel() {
		return officeTel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.OFFICE_TEL
	 * @param officeTel  the value for za_user.OFFICE_TEL
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.MOBILE_TELE
	 * @return  the value of za_user.MOBILE_TELE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getMobileTele() {
		return mobileTele;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.MOBILE_TELE
	 * @param mobileTele  the value for za_user.MOBILE_TELE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setMobileTele(String mobileTele) {
		this.mobileTele = mobileTele;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.ADDR_ID
	 * @return  the value of za_user.ADDR_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getAddrId() {
		return addrId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.ADDR_ID
	 * @param addrId  the value for za_user.ADDR_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setAddrId(String addrId) {
		this.addrId = addrId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.EMAIL
	 * @return  the value of za_user.EMAIL
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.EMAIL
	 * @param email  the value for za_user.EMAIL
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.CREATE_DATE
	 * @return  the value of za_user.CREATE_DATE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.CREATE_DATE
	 * @param createDate  the value for za_user.CREATE_DATE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.EFFECT_DATE
	 * @return  the value of za_user.EFFECT_DATE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Date getEffectDate() {
		return effectDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.EFFECT_DATE
	 * @param effectDate  the value for za_user.EFFECT_DATE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setEffectDate(Date effectDate) {
		this.effectDate = effectDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.EXPIRE_DATE
	 * @return  the value of za_user.EXPIRE_DATE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Date getExpireDate() {
		return expireDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.EXPIRE_DATE
	 * @param expireDate  the value for za_user.EXPIRE_DATE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.MULTI_LOGIN_FLAG
	 * @return  the value of za_user.MULTI_LOGIN_FLAG
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Short getMultiLoginFlag() {
		return multiLoginFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.MULTI_LOGIN_FLAG
	 * @param multiLoginFlag  the value for za_user.MULTI_LOGIN_FLAG
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setMultiLoginFlag(Short multiLoginFlag) {
		this.multiLoginFlag = multiLoginFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.LAST_LOGIN_LOG_ID
	 * @return  the value of za_user.LAST_LOGIN_LOG_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Long getLastLoginLogId() {
		return lastLoginLogId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.LAST_LOGIN_LOG_ID
	 * @param lastLoginLogId  the value for za_user.LAST_LOGIN_LOG_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setLastLoginLogId(Long lastLoginLogId) {
		this.lastLoginLogId = lastLoginLogId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.TRY_TIMES
	 * @return  the value of za_user.TRY_TIMES
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Long getTryTimes() {
		return tryTimes;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.TRY_TIMES
	 * @param tryTimes  the value for za_user.TRY_TIMES
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setTryTimes(Long tryTimes) {
		this.tryTimes = tryTimes;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.LOCK_FLAG
	 * @return  the value of za_user.LOCK_FLAG
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getLockFlag() {
		return lockFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.LOCK_FLAG
	 * @param lockFlag  the value for za_user.LOCK_FLAG
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setLockFlag(String lockFlag) {
		this.lockFlag = lockFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.IS_LOGIN
	 * @return  the value of za_user.IS_LOGIN
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getIsLogin() {
		return isLogin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.IS_LOGIN
	 * @param isLogin  the value for za_user.IS_LOGIN
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setIsLogin(String isLogin) {
		this.isLogin = isLogin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.STATE
	 * @return  the value of za_user.STATE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getState() {
		return state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.STATE
	 * @param state  the value for za_user.STATE
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.CREATOR
	 * @return  the value of za_user.CREATOR
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.CREATOR
	 * @param creator  the value for za_user.CREATOR
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.CREATE_TIME
	 * @return  the value of za_user.CREATE_TIME
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.CREATE_TIME
	 * @param createTime  the value for za_user.CREATE_TIME
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.MODIFIER
	 * @return  the value of za_user.MODIFIER
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getModifier() {
		return modifier;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.MODIFIER
	 * @param modifier  the value for za_user.MODIFIER
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.MODIFY_TIME
	 * @return  the value of za_user.MODIFY_TIME
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.MODIFY_TIME
	 * @param modifyTime  the value for za_user.MODIFY_TIME
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.REC_VER
	 * @return  the value of za_user.REC_VER
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public Long getRecVer() {
		return recVer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.REC_VER
	 * @param recVer  the value for za_user.REC_VER
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setRecVer(Long recVer) {
		this.recVer = recVer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.QQ
	 * @return  the value of za_user.QQ
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.QQ
	 * @param qq  the value for za_user.QQ
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.ICON
	 * @return  the value of za_user.ICON
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.ICON
	 * @param icon  the value for za_user.ICON
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.ICON_SMALL
	 * @return  the value of za_user.ICON_SMALL
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getIconSmall() {
		return iconSmall;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.ICON_SMALL
	 * @param iconSmall  the value for za_user.ICON_SMALL
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setIconSmall(String iconSmall) {
		this.iconSmall = iconSmall;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.MSN
	 * @return  the value of za_user.MSN
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getMsn() {
		return msn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.MSN
	 * @param msn  the value for za_user.MSN
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setMsn(String msn) {
		this.msn = msn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.ONLINE_STATUS
	 * @return  the value of za_user.ONLINE_STATUS
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getOnlineStatus() {
		return onlineStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.ONLINE_STATUS
	 * @param onlineStatus  the value for za_user.ONLINE_STATUS
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setOnlineStatus(String onlineStatus) {
		this.onlineStatus = onlineStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.UNITS_ID
	 * @return  the value of za_user.UNITS_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getUnitsId() {
		return unitsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.UNITS_ID
	 * @param unitsId  the value for za_user.UNITS_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setUnitsId(String unitsId) {
		this.unitsId = unitsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.ISSENDMSG
	 * @return  the value of za_user.ISSENDMSG
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getIssendmsg() {
		return issendmsg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.ISSENDMSG
	 * @param issendmsg  the value for za_user.ISSENDMSG
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setIssendmsg(String issendmsg) {
		this.issendmsg = issendmsg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.TENANT_ID
	 * @return  the value of za_user.TENANT_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.TENANT_ID
	 * @param tenantId  the value for za_user.TENANT_ID
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column za_user.REMARKS
	 * @return  the value of za_user.REMARKS
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column za_user.REMARKS
	 * @param remarks  the value for za_user.REMARKS
	 * @mbg.generated  Sun Jul 01 13:16:41 CST 2018
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}