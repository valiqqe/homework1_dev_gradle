package org.example;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        String name = "Valentyn";
        String lastName = "Didok";

        MyName myName = new MyName(name, lastName);

        Gson gson = new Gson();
        String json = gson.toJson(myName);

        System.out.println(json);
    }
}

class MyName {
    private final String name;
    private final String lastName;

    public MyName(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}