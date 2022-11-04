package com.codegym.sort;

import com.codegym.sort.comparator.ComparatorByWeight;
import com.codegym.sort.comparator.Dog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Application {
    public static Scanner scanner = new Scanner(System.in);
    public static int number;
    public static void main(String[] args) {
        Animal [] animals = new Animal[3];
        animals[0] = new Cat("Meo 1", true, 80);
        animals[1] = new Dog("Mieu Mieu", false, 80);
        animals[2] = new Cat("Meo doremon", true, 10);

        Comparator<Object> comparator = new ComparatorByWeight();
        do {
            System.out.println("Chon thuat toan ban muon sap xep");
            int action = Integer.parseInt(scanner.nextLine());
            switch (action) {
                case 1:
                    BubleSort.BubbleSort(animals, comparator);
                    break;
                case 2:
                    SelectionSort.selectionSort(animals, comparator);
                    break;
                case 3:
                    InterchangeSort.interchangeSort(animals, comparator);
                    break;
                case 4:{
                    killAll(animals);
                    break;
                }
                case 5:{
                    do{
                        System.out.print("select animal to kill: ");
                        number = Integer.parseInt(scanner.nextLine());
                    }while (number > animals.length || number < 0);

                    killEach(animals, number);
                }
                case 6:{

                }

            }
            System.out.println(Arrays.toString(animals));
        }while (true);

        // Làm thịt hết tất cả các động vật
        // Làm sao 1 con vật sống sống và tìm anh em sinh đôi của nó
    }
    public static void killAll(Animal[] animals){
        for(Animal animal: animals){
            animal.setAlive(false);
        }
    }
    public static void killEach(Animal[] animals, int index){
        animals[index].setAlive(true);
    }
//    public static void respawnToKill(Animal animal1, Animal animal2){
//        if(animal1.getWeight() > animal2.getWeight()){
//            if(animal1.isAlive()== false){
//                animal2.setWeight(animal1.getWeight() + animal2.getWeight());
//            }else{
//                animal1.setWeight(animal1.getWeight() + animal2.getWeight());
//            }
//        }
//    }

}
