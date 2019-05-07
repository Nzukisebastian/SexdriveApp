package com.example.sexdriveapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("phone")
    @Expose
    private String phones;
    @SerializedName("amount")
    @Expose
    private String amounts;

    public User(String phone, String amount) {
        this.phones = phone;
        this.amounts = amount;
    }
}
