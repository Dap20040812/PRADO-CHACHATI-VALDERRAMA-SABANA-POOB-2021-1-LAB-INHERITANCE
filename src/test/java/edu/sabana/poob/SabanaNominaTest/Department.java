package edu.sabana.poob.SabanaNominaTest;

import java.util.UUID;

public class Department{

    private String name;
    private UUID id;

    public Department(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public String getName(){return name;}

}
