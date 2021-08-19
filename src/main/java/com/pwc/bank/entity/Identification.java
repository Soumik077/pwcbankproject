package com.pwc.bank.entity;


import javax.persistence.*;

@Entity
@Table(name="Identification")
public class Identification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String identificationType;

    private double identificationNumber;

    @ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName = "customerId")
    private Users users;

}
