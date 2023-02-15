package com.learnpython.pythonprograms;
import java.io.Serializable;

public class ItemsModel implements Serializable{

    private String name;

    public ItemsModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
