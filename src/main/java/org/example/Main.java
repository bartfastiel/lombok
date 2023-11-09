package org.example;

public class Main {
    public static void main(String[] args) {

        DogSchool mySchool = new DogSchool(3, 7);
        mySchool.addMember();
        mySchool.setDogs(4);
        mySchool.addMember();
        System.out.println("Humans: "+mySchool.getHumans());
        System.out.println("Dogs: "+mySchool.getDogs());

        Dog wuffi = Dog.builder()
                .name("Wuffi")
                .age(4)
                .memberNumber("askd1213")
                .build();
        System.out.println(wuffi);

        Dog wuffibla = wuffi.withName("Wuffibla");
        System.out.println(wuffibla);

    }
}