package main;

import animal.Animal;
import fabricAnimal.Fabric;

public class Main {
    public static void main(String[] args){
        Fabric fabric= new Fabric();
        Animal animal= fabric.getAnimal("мяу","черная");
        System.out.println(animal.toString());
    }
}
