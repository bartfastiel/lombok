package org.example;

import lombok.With;

@With
public record Dog(
        String name,
        int age,
        String memberNumber
) {
}
