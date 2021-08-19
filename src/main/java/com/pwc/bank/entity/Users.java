package com.pwc.bank.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="users")
public class Users{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customerId")
    private long customerId;

    @Column
    private String firstName;

    @Column
    private String middleName;

    @Column
    private String lastName;

    @Column
    private String emailId;

    @Column
    private double mobileNumber;

    @Column
    private String dateOfBirth;

    @Column
    private String occupation;

    @OneToMany(mappedBy = "users")
    private List<Address> address;
	
	@OneToMany(mappedBy = "users")
    private List<Identification> identification;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setMobileNumber(double mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}