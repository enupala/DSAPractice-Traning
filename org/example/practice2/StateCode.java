package org.example.practice2;

public class StateCode {
    private String state;
    private String city;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public StateCode(String state, String city) {
        this.state = state;
        this.city = city;
    }
}
