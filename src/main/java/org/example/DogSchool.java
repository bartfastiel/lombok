package org.example;

import lombok.Data;

@Data
public class DogSchool {

    private int humans;
    private int dogs;

    public void addMember() {
        humans++;
        dogs++;
    }

}

