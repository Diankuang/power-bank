package com.power.bank.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class TUser implements Serializable {
    /**
     * 用户ID，主键
     */
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * first name
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * last name
     */
    @Column(name = "last_name")
    private String lastName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 账户密码
     */
    private String password;

    /**
     * 公司
     */
    private String company;

    /**
     * phone number
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    private String fax;

    /**
     * country
     */
    private String country;

    /**
     * postal code
     */
    @Column(name = "postal_code")
    private String postalCode;

    /**
     * city
     */
    private String city;

    /**
     * street address
     */
    @Column(name = "street_address")
    private String streetAddress;

    /**
     * user class，用户类别，1为管理员，2为普通用户
     */
    @Column(name = "user_class")
    private Integer userClass;

    /**
     * 状态，1有效，0无效
     */
    private String status;

    private Integer gender;

    private Double height;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "updatet_time")
    private Date updatetTime;

    private Double weight;

    private Date birthday;

    /**
     * 订阅邮箱
     */
    private String subscribe;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户ID，主键
     *
     * @return user_id - 用户ID，主键
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID，主键
     *
     * @param userId 用户ID，主键
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取first name
     *
     * @return first_name - first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置first name
     *
     * @param firstName first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * 获取last name
     *
     * @return last_name - last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置last name
     *
     * @param lastName last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取账户密码
     *
     * @return password - 账户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置账户密码
     *
     * @param password 账户密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取公司
     *
     * @return company - 公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公司
     *
     * @param company 公司
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * 获取phone number
     *
     * @return phone_number - phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置phone number
     *
     * @param phoneNumber phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * @return fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    /**
     * 获取country
     *
     * @return country - country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置country
     *
     * @param country country
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 获取postal code
     *
     * @return postal_code - postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 设置postal code
     *
     * @param postalCode postal code
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    /**
     * 获取city
     *
     * @return city - city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置city
     *
     * @param city city
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取street address
     *
     * @return street_address - street address
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * 设置street address
     *
     * @param streetAddress street address
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress == null ? null : streetAddress.trim();
    }

    /**
     * 获取user class，用户类别，1为管理员，2为普通用户
     *
     * @return user_class - user class，用户类别，1为管理员，2为普通用户
     */
    public Integer getUserClass() {
        return userClass;
    }

    /**
     * 设置user class，用户类别，1为管理员，2为普通用户
     *
     * @param userClass user class，用户类别，1为管理员，2为普通用户
     */
    public void setUserClass(Integer userClass) {
        this.userClass = userClass;
    }

    /**
     * 获取状态，1有效，0无效
     *
     * @return status - 状态，1有效，0无效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态，1有效，0无效
     *
     * @param status 状态，1有效，0无效
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * @return height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return updatet_time
     */
    public Date getUpdatetTime() {
        return updatetTime;
    }

    /**
     * @param updatetTime
     */
    public void setUpdatetTime(Date updatetTime) {
        this.updatetTime = updatetTime;
    }

    /**
     * @return weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取订阅邮箱
     *
     * @return subscribe - 订阅邮箱
     */
    public String getSubscribe() {
        return subscribe;
    }

    /**
     * 设置订阅邮箱
     *
     * @param subscribe 订阅邮箱
     */
    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe == null ? null : subscribe.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", company=").append(company);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", fax=").append(fax);
        sb.append(", country=").append(country);
        sb.append(", postalCode=").append(postalCode);
        sb.append(", city=").append(city);
        sb.append(", streetAddress=").append(streetAddress);
        sb.append(", userClass=").append(userClass);
        sb.append(", status=").append(status);
        sb.append(", gender=").append(gender);
        sb.append(", height=").append(height);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatetTime=").append(updatetTime);
        sb.append(", weight=").append(weight);
        sb.append(", birthday=").append(birthday);
        sb.append(", subscribe=").append(subscribe);
        sb.append("]");
        return sb.toString();
    }
}