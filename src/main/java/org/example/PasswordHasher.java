package org.example;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordHasher {
    public static void main(String[] args) {
        String plainPassword = "admin";
        String hashedPassword = BCrypt.hashpw(plainPassword, BCrypt.gensalt());

        System.out.println("Hashed password: " + hashedPassword);

    }
}
