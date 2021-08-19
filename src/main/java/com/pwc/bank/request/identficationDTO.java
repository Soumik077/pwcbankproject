package com.pwc.bank.request;

public class identficationDTO
{
    private int id;
    private String identificationType;
    private double identificationNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public double getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(double identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    @Override
    public String toString() {
        return "identficationDTO{" +
                "id=" + id +
                ", identificationType='" + identificationType + '\'' +
                ", identificationNumber=" + identificationNumber +
                '}';
    }

    public identficationDTO(int id, String identificationType, double identificationNumber) {
        this.id = id;
        this.identificationType = identificationType;
        this.identificationNumber = identificationNumber;
    }
}
