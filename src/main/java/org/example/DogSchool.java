package org.example;

import lombok.Getter;

@Getter
public class DogSchool {

    private int humans;
    private int dogs;

    public void addMember() {
        humans++;
        dogs++;
    }

}

