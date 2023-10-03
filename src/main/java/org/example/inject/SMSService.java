package org.example.inject;

public class SMSService implements Service{

    @Override
    public boolean send(String msg) {
        System.out.println("SMS sent to "+msg);
        return true;
    }
}
