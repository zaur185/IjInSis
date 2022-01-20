package fabricAnimal;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class Fabric {
    public Animal getAnimal(String voice, String color){
        Animal animal = null;
        if(voice=="мяу"){
            animal = new Cat(color);
        }else if (voice=="гав"){
            animal = new Dog(color);
        }

        return animal;
    }
}
