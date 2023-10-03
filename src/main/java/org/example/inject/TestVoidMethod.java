package org.example.inject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


public class TestVoidMethod {
    public Map<String, String> map=new HashMap<String, String>();

    private List l = new ArrayList();

    public void addString(String word, String meaning){
        System.out.println("real method");
        map.put(word, meaning);
    }
    public void add(String str){
        l.add(str);
    }
    public int size(){
        return l.size();
    }
}
