package com.demo.serenity.is.testing.util;

public enum User {

    FULL_NAME("WillingtonDiaz"),
    FULL_NAME2("admin"),
    EMAIL("WillingtonDiaz20234@gmail.com"),
    CONFIRM_EMAIL("WillingtonDiaz20234@gmail.com"),
    PASSWORD("Colombia2023"),
    PASSWORD2("serenity"),
    CONFIRM_PASSWORD("Colombia2023");


    private String value;

    User(String value) {

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
