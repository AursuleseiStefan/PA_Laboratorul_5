package com.company;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Document implements Serializable {
    private String id;
    private String name;
    private String location; //file name or Web page

    private Map<String, Object> tags = new HashMap<>();

    public Document(Object java1, Object s, Object s1) {

    }

    //…
    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }

    public Object getId() {
        return this.id;
    }
}
