package com.pwc.bank.request;

public class usersDTO
{
    private long customerId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String emailId;
    private double mobileNumber;
    private String dateOfBirth;
    private String occupation;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public double getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(double mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "usersDTO{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public usersDTO(long customerId, String firstName, String middleName,
                    String lastName, String emailId, double mobileNumber,
                    String dateOfBirth, String occupation) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.dateOfBirth = dateOfBirth;
        this.occupation = occupation;
    }
}
