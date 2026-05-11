package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Section> sections;

    public Department(String name) {
        this.name = name;
        this.sections = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void addSection(Section section) {
        sections.add(section);
    }
}
