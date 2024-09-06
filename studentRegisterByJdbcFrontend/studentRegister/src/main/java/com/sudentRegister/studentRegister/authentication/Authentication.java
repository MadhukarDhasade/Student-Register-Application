package com.sudentRegister.studentRegister.authentication;

import org.springframework.stereotype.Component;

@Component
public class Authentication {

    public boolean authenticateUserAndPass(String name,String password) {
      boolean validUsername = name.equalsIgnoreCase("Madhukar");
      boolean validPassword = password.equalsIgnoreCase("password");

        return validUsername&&validPassword;
    }
}
