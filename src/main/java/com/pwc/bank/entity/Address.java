package com.pwc.bank.entity;

import javax.persistence.*;

@Entity
@Table(name="Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

//    add cid as foreign key

    //from address table to user table
	
	@ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName = "customerId")
    private Users users;

    @Column
    private String line;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String country;

    @Column
    private long pincode;

    public void setUsers(Users users) {
        this.users = users;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public void setId(int id) {
        this.id = id;
    }
}
