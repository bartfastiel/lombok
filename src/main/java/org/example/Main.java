package org.example;

public class Main {
    public static void main(String[] args) {

        DogSchool mySchool = new DogSchool();
        mySchool.addMember();
        mySchool.addMember();
        System.out.println("Humans: "+mySchool.getHumans());
        System.out.println("Dogs: "+mySchool.getDogs());
    }
}