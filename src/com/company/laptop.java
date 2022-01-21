package com.company;

import java.awt.*;
import java.util.ArrayList;

public class laptop extends Device{

    private ArrayList<Component> components = new ArrayList();

    public laptop(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority, ArrayList<Component> components) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priority);
        this.components = components;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public void addComponents(Component components) {
        this.components.add(components);
    }
}
