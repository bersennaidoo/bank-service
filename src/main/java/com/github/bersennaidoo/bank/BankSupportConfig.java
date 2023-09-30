package com.github.bersennaidoo.bank;


import org.eclipse.microprofile.config.inject.ConfigProperties;

import jakarta.validation.constraints.Size;

@ConfigProperties(prefix = "bank-support")
public class BankSupportConfig {
    private String phone;

    public String email;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

