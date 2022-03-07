package com.example.thtuan4.model;

public class Language {
    private int id;
    private String name;
    private String namered;

    public Language(int id, String name,String namered) {
        this.id = id;
        this.name = name;
        this.namered=namered;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getNamered() {
        return namered;
    }

    public void setNamered(String namered) {
        this.namered = namered;
    }
}
