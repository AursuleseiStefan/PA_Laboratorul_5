package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {
    private String name;
    private String path;
    private List<Document> documents = new ArrayList<>();

    public Catalog(Object java_resources, Object s) {

    }

    //…
    public void add(Document doc) {
        documents.add(doc);
    }
    public Document findById (String id) {
        for (Document doc : documents) {
            if (doc.getId().equals(id)) {
                return doc;
            }
        }
        return null;
    }



    public String getPath() {
        return this.path;
    }
}
