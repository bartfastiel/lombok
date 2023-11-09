package org.example;

public class Main {
    public static void main(String[] args) {

        DogSchool mySchool = new DogSchool(3, 7);
        mySchool.addMember();
        mySchool.setDogs(4);
        mySchool.addMember();
        System.out.println("Humans: "+mySchool.getHumans());
        System.out.println("Dogs: "+mySchool.getDogs());
    }
}