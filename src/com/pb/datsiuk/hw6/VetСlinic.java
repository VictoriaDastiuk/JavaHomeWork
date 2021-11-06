package com.pb.datsiuk.hw6;

public class VetСlinic {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("М'ясо і корм", "Квартира");
        animals[1] = new Cat("Риба і корм", "Квартира");
        animals[2] = new Horse("Сіно", "Іподром");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
