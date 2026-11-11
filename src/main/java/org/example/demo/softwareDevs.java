package org.example.demo;

import java.util.List;

public class softwareDevs {

    private Integer id;
    private String name;
    private String email;
    private List<String> techStack;

    public softwareDevs(Integer id, String name, String email, List<String> techStack) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.techStack = techStack;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getTechStack() {
        return techStack;
    }
}
