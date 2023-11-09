package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DogSchool {

    private int humans;
    private int dogs;

    public void addMember() {
        humans++;
        dogs++;
    }

}

