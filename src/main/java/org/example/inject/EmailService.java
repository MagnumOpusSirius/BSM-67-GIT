package org.example.inject;

public class EmailService implements Service{

    @Override
    public boolean send(String msg) {
        System.out.println("Email sent to "+msg);
        return true;
    }
}
