import animals.Animals;
import animals.Cat;
import animals.Chicken;
import animals.Tiger;
import edible.Edible;
import fruits.Apple;
import fruits.Fruit;
import fruits.Orange;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = new Animals[3];
        animals[0] = new Cat();
        animals[1] = new Chicken();
        animals[2] = new Tiger();
        for(Animals animal: animals){
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                System.out.println(((Chicken) animal).howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for(Fruit fruit: fruits){
            System.out.println(fruit.howToEat());
        }
    }
}