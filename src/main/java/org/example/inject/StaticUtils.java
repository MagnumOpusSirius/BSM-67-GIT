package org.example.inject;

public class StaticUtils {

    public static String range(){
        return "msg";
    }
    public String getTest(String msg){
        String msg1= privateTest(msg);
        return msg1;
    }
    private String privateTest(String msg){
        return msg+"Building";
    }
}
