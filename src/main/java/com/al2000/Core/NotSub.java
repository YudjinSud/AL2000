package com.al2000.Core;

public class NotSub extends User {


    public NotSub(int userId, String creditCard, String someAdditionalAttribute) {
        super(userId, creditCard);
        this.someAdditionalAttribute = someAdditionalAttribute;
    }


    public void createSubAccount() {

    }


}