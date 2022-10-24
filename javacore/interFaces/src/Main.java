public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                System.out.println(((Chicken) animal).howToEat());
            }
        }
    }
}