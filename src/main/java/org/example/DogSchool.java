package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DogSchool {

    private int humans;
    private int dogs;

    public void addMember() {
        humans++;
        dogs++;
    }

}

