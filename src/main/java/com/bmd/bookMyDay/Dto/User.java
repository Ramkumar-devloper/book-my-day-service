package com.bmd.bookMyDay.Dto;

// import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userInfo")
public class User {

    @Id
    @Column(name = "mailId")
    private String mailId;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "updatedBy")
    private String updatedBy;

    @Column(name = "isUserActive")
    private boolean isUserActive;

    public User() {
        super();
    }

    public String getMailId(){
        return this.mailId;
    }
    public void setMailId(String mailId){
        this.mailId = mailId;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getRole(){
        return this.role;
    }
    public void setRole(String role){
        this.role = role;
    }
    public String getFirst_Name(){
        return this.firstName;
    }
    public void setFirst_Name(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getCreatedBy(){
        return this.createdBy;
    }
    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }
    public String getUpdatedBy(){
        return this.updatedBy;
    }
    public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }
    public Boolean getIsUserActive(){
        return this.isUserActive;
    }
    public void setIsUserActive(Boolean isUserActive){
        this.isUserActive = isUserActive;
    }
}