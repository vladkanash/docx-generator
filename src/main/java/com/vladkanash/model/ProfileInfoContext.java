package com.vladkanash.model;

import java.util.List;

public class ProfileInfoContext {

    public ProfileInfoContext() {};

    private String name;
    private String email;
    private List<String> summary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getSummary() {
        return summary;
    }

    public void setSummary(List<String> summary) {
        this.summary = summary;
    }
}
