package com.pwc.bank.request;

public class addressDTO
{
    private int id;
    private String line;
    private String city;
    private String state;
    private String country;
    private long pincode;

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "addressDTO{" +
                "id=" + id +
                ", line='" + line + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public addressDTO(int id, String line, String city, String state, String country, long pincode) {
        this.id = id;
        this.line = line;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}
