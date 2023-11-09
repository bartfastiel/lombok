package org.example;

import lombok.Builder;
import lombok.With;

@With
@Builder
public record Dog(
        String name,
        int age,
        String memberNumber
) {
}
